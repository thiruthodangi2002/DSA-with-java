package polymorphism;

class bike {

  void run() {
    System.out.println("run");
  }
}

class splender extends bike {

  void run() {
    System.out.println("run safely with 60 km");
  }
}

public class runtimepoly {

  public static void main(String[] args) {
    bike b = new splender(); //upcasting
    b.run();
  }
}
