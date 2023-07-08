package collectionsframework.setinterface;

import java.util.LinkedHashSet;

public class linkedlistset {

  public static void main(String[] args) {
    LinkedHashSet<String> ls = new LinkedHashSet<>();
    ls.add("ravi");
    ls.add("vijay");
    ls.add("ravi");
    ls.add("ajay");
    for (String str : ls) {
      System.out.print(str + " ");
    }
  }
}
