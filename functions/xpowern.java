package functions;

import java.util.Scanner;

public class xpowern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter x value:");
    int x = sc.nextInt();
    System.out.println("enter n value:");
    int n = sc.nextInt();
    int result = 1;
    for (int i = 0; i < n; i++) {
      result = result * x;
    }
    System.out.println("the value of x power n is :" + result);
  }
}
