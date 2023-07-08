package bitmanipulation;

import java.util.Scanner;

public class clear {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n value");
    int n = sc.nextInt();
    System.out.println("ente the position");
    int pos = sc.nextInt();
    int bitmask = 1 << pos;
    int newbitmask = ~(bitmask);
    int newnumber = newbitmask & n;
    System.out.println(newnumber);
  }
}
