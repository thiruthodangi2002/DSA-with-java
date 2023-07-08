package Arraysquestions.twodarrays;

import java.util.*;

public class spiralmat {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of  rows in the matrix:");
    int n = sc.nextInt();
    System.out.println("enter the number of columns in the matrix:");
    int m = sc.nextInt();
    // array declaration
    int matrix[][] = new int[n][m];
    System.out.println("enter the matrix");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("entered matrix is:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("the spiral matrix is:");
    int rowstart = 0; // 0
    int rowend = n - 1; // 3
    int colstart = 0; // 0
    int colend = m - 1; // 3
    while (rowstart <= rowend && colstart <= colend) {
      for (int col = colstart; col <= colend; col++) {
        System.out.print(matrix[rowstart][col] + " ");
      }

      rowstart++; // 1
      for (int row = rowstart; row <= rowend; row++) {
        System.out.print(matrix[row][colend] + " ");
      }

      colend--; // 2
      for (int col = colend; col >= colstart; col--) {
        System.out.print(matrix[rowend][col] + " ");
      }

      rowend--; // 2
      for (int row = rowend; row >= rowstart; row--) {
        System.out.print(matrix[row][colstart] + " ");
      }
      colstart++; // 1
      System.out.println();
    }
  }
}
