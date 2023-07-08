package collectionsframework.listinterface;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("ravi");
    ll.add("bhuvi");
    ll.add("ragav");
    ll.add("ravi");

    Iterator<String> itr = ll.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
