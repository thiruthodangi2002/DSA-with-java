package Recursion.basic;

import java.util.Scanner;

public class printnum {

  public static void printnum(int n) {
    if (n == 51) {
      return;
    }
    System.out.print(n + " ");
    printnum(n + 1);
  }

  public static void main(String[] args) {
    System.out.println("enter the n value:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printnum(n);
  }
}
