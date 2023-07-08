package functions;

///avg of 3 numbers
import java.util.Scanner;

public class avg {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a,b, c values");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int avg = (a + b + c) / 3;
    System.out.println("avg of the abc is:" + avg);
  }
}
