package functions;

// vote elgibility
import java.util.Scanner;

public class age {

  public static void iselligible(int age) {
    if (age > 18) {
      System.out.println("you are elegible to vote");
    } else {
      System.out.println("you have to wait ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your age");
    int age = sc.nextInt();
    iselligible(age);
  }
}
