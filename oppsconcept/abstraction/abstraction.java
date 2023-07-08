package abstraction;

abstract class bike {
    bike(){
        System.out.println("bike is created:");
    }
    void colour(){
        System.out.println("red");
    }

  abstract void run();
}

class honda extends bike {

  void run() {
    System.out.println("runnig");
  }
}

public class abstraction {

  public static void main(String[] args) {
    bike b = new honda(); //upcasting
    b.run();
    b.colour();
  }
}
