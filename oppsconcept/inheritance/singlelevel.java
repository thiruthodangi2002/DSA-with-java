package inheritance;

class animal {

  void eating() {
    System.out.println("eating");
  }
}

class dog extends animal {

  void barking() {
    System.out.println("barking");
  }
}

public class singlelevel {

  public static void main(String[] args) {
    dog d1 = new dog();
    d1.barking();
    d1.eating();
  }
}
