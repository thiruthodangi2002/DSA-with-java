package functions;

// the cirum flex of the circle
import java.util.Scanner;

public class circumflex {

  public static double getcirumflex(Double radius) {
    return 2 * 3.14 * radius;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter radius: ");
    double radius = sc.nextDouble();
    System.out.print("the cirumflex is:");
    System.out.println(getcirumflex(radius));
  }
}
