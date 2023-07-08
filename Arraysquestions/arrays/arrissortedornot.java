package Arraysquestions.arrays;

//to check wheather the given array is sorted in ass order or not
import java.util.Scanner;

public class arrissortedornot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n = sc.nextInt();
    System.out.println("enter the  elements in the array");
    int number[] = new int[n];
    for (int i = 0; i < n; i++) {
      number[i] = sc.nextInt();
    }
    boolean isAscending = true;
    for (int i = 0; i < number.length - 1; i++) {
      if (number[i] > number[i + 1]) {
        isAscending = false;
      }
    }
    if (isAscending) {
      System.out.println("the array is in sorted order:");
    } else {
      System.out.println("the array is not in sorted order");
    }
  }
}
