package collectionsframework.listinterface;

import java.util.*;

public class stack {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    stack.push("thiru");
    stack.push("hari");
    stack.push("chiru");
    stack.push("shanaya");
    System.out.println(stack);
    stack.pop();
    Iterator<String> itr = stack.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
    System.out.println();
  }
}
