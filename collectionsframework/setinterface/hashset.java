package collectionsframework.setinterface;

import java.util.*;

public class hashset {

  public static void main(String[] args) {
    HashSet<String> hs = new HashSet<String>();
    hs.add("hello");
    hs.add("world");
    hs.add("hi");
    hs.add(null);
    hs.add("world");
    System.out.println("iteration");
    for (String str : hs) {
      System.out.println(str);
    }
  }
}
