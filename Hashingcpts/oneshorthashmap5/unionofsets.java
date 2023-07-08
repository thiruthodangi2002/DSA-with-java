package Hashingcpts.oneshorthashmap5;

import java.util.HashSet;

public class unionofsets {
    // union
    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        return set.size();

    }

    // intersection
    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);

            }

        }
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));

    }

}
