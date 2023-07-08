package Arraysquestions.arrays;

import java.util.Scanner;

public class name {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter how many names you want to enter:");
    int size = sc.nextInt();
    String names[] = new String[size];
    System.out.println("enter the name you want to enter:");
    for (int i = 0; i < size; i++) {
      names[i] = sc.next();
    }
    System.out.println("entered names:");
    for (int i = 0; i < names.length; i++) {
      System.out.println("the name" + (i + 1) + "is :" + names[i]);
    }
  }
}
