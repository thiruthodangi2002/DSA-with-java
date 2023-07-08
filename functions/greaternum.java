package functions;

import java.util.Scanner;

public class greaternum {

  public static int getgrt(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a");
    int a = sc.nextInt();
    System.out.println("enter b");
    int b = sc.nextInt();
    System.out.println("the greater number is:" + getgrt(a, b));
  }
}
