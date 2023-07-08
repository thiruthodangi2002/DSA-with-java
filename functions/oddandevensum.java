package functions;

import java.util.Scanner;

public class oddandevensum {

  public static void even(int n) {
    int evensum = 0, oddsum = 0;
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        evensum += i;
      }
    }
    System.out.println(evensum);
  }

  // public static void odd(int n) {
  //   int oddsum = 0;
  //   for (int i = 0; i < n; i++) {
  //     if (i % 2 != 0) {
  //       oddsum += i;
  //     }
  //   }
  //   System.out.println(oddsum);
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n value:");
    int n = sc.nextInt();
    even(n);
    // odd(n);
  }
}
