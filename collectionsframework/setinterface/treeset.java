package collectionsframework.setinterface;

import java.util.*;

public class treeset {

  public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<>();
    ts.add("bom");
    ts.add("laddu");
    ts.add("raj");
    for (String str : ts) {
      System.out.println(str);
    }
  }
}
