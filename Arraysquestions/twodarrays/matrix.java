package Arraysquestions.twodarrays;

// print the matrix
import java.util.*;

public class matrix {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of  rows in the matrix:");
    int rows = sc.nextInt();
    System.out.println("enter the number of columns in the matrix:");
    int cols = sc.nextInt();
    // array declaration
    int matrix[][] = new int[rows][cols];
    System.out.println("enter the matrix");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("entered matrix is:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
