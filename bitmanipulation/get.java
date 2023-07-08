package bitmanipulation;

//this bit manipulation saves the time
//get method is to get the value of the bit at particular place
public class get {

  public static void main(String[] args) {
    int n = 5; // 1010
    int pos = 2;
    int bitmask = 1 << pos;
    if ((bitmask & n) == 0) {
      System.out.println("the bit is zero:");
    } else {
      System.out.println("the bit is one");
    }
  }
}
