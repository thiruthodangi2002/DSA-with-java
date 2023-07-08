package objcls;

public class student {

  int id;
  String name;

  student() {
    System.out.println("new student");
  }

  public void studentdetails(int i, String s) {
    id = i;
    name = s;
  }

  public static void main(String[] args) {
    student s1 = new student();
    s1.studentdetails(100, "sooribabu");
    System.out.println(s1.id + " " + s1.name);
  }
}
