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

class cat extends animal {

  void meow() {
    System.out.println("meow");
  }
}

public class hierarchical {

  public static void main(String[] args) {
    cat c = new cat();
    c.eating();
    c.meow();
    dog d = new dog();
    d.barking();
    d.eating();
  }
}
