package Recursion.basic;

import java.util.*;

import strings.replace;

public class factorial {
    public static int calcfact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = calcfact(n - 1);
        int factorial = n * fact;
        return factorial;

    }

    public static void main(String[] args) {
        System.out.println("enter the n value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the factorial of  n is " + calcfact(n));

    }
}
