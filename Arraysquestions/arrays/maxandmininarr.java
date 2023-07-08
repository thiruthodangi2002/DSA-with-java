package Arraysquestions.arrays;

//to get the max and min element in the array at once
import java.util.Scanner;

public class maxandmininarr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n = sc.nextInt();
    System.out.println("enter the elements of the array");
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("the maximum element is :" + max);
    System.out.println("the minimum element is :" + min);
  }
}
