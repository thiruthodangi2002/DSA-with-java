package Recursion.basic;

import java.util.Scanner;

public class fibonacci {
    public static void fibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibo(b, c, n - 1);

    }

    public static void main(String[] args) {
        System.out.println("enter n value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        fibo(a, b, n - 2);

    }

}
