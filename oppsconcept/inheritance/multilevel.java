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

class babydog extends dog {

  void weeping() {
    System.out.println("weeping" + " ");
  }
}

public class multilevel {

  public static void main(String[] args) {
    babydog bd = new babydog();
    bd.barking();
    bd.eating();
    bd.weeping();
  }
}
