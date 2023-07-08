package objcls;

class employee {

  int id;
  String name;
  float salary;

  public void insert(int i, String n, float s) {
    id = i;
    name = n;
    salary = s;
  }

  public void display() {
    System.out.println(id + " " + name + " " + salary);
  }

  public void talent() {
    System.out.println("he can sing and dance");
  }
}

public class objclsexm {

  public static void main(String[] args) {
    employee e1 = new employee();
    employee e2 = new employee();
    e1.insert(1, "thiru", 50000);
    e1.display();
    e1.talent();
    e2.insert(2, "hari", 50000);
    e2.display();
    e2.talent();
  }
}
