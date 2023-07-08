package functions;

import java.util.Scanner;

//count total number of zeros , positive, negative numbers:
public class count {

  public static void main(String[] args) {
    int positive = 0, zero = 0, negative = zero;
    System.out.println("press 1 to continue or any key to stop:");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    while (input == 1) {
      System.out.println("enter a value:");
      input = sc.nextInt();
      if (input == 0) {
        zero++;
      } else if (input > 0) {
        positive++;
      } else {
        negative++;
      }
      System.out.println("press 1 to continue or any key  to stop:");
      input = sc.nextInt();
    }
    System.out.println("total no of zeros:" + zero);
    System.out.println("total no of positives:" + positive);
    System.out.println("total no of negatives:" + negative);
  }
}
