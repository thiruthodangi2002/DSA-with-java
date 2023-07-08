package Hashingcpts;

import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1); // will not add because of no duplicacy
        // remove

        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("set not contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("doesn't contains 6");
        }
        System.out.println(set.size());

        System.out.println(set);
        // iteration
        for (int str : set) {
            System.out.println(str + " ");

        }

    }

}
// time complexity for all add,remove,search =O(1);
