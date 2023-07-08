package collectionsframework.queueinterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {

  public static void main(String[] args) {
    Deque<String> dq = new ArrayDeque<>();
    dq.add("thiru");
    dq.add("chiru");
    dq.add("raj");

    for (String str : dq) {
      System.out.println(str);
    }
    dq.remove("chiru");
    System.out.println(dq);
  }
}
