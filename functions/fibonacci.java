package functions;

import java.util.Scanner;

public class fibonacci {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n value:");
    int n = sc.nextInt();
    int a = 0, b = 1;
    System.out.print(a + " ");
    for (int i = 2; i <= n; i++) {
      System.out.print(b + " ");
      int temp = b;
      b = a + b;
      a = temp;
    }
    System.out.println();
  }
}
