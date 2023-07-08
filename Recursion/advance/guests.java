package Recursion.advance;

import java.util.*;

public class guests {
    public static int printways(int n) {
        if (n <= 1) {
            return 1;
        }
        // singel
        int way1 = printways(n - 1);
        // couples
        int way2 = printways(n - 1) * printways(n - 2);
        return way1 + way2;

    }

    public static void main(String[] args) {
        System.out.println("enter the no of guests:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("the total no of ways:" + printways(n) + " ");

    }

}
