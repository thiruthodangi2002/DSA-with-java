package Recursion.advance;

import java.util.ArrayList;

public class subset {
    public static void printsubset(ArrayList<Integer> subset) {

        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void Subset(int n, ArrayList<Integer> subset) {
        if (n == 0) {

            printsubset(subset);
            return;
        }

        // toways
        // add to subset
        subset.add(n);
        Subset(n - 1, subset);
        // otherwise remove

        subset.remove(subset.size() - 1);
        Subset(n - 1, subset);

    }

    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> subset = new ArrayList<>();
        Subset(n, subset);

    }

}
