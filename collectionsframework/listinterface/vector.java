package collectionsframework.listinterface;

import java.util.Iterator;
import java.util.Vector;

public class vector {

  public static void main(String[] args) {
    Vector<String> v = new Vector<>();
    v.add("thiru");
    v.add("chiru");
    v.add("hari");
    Iterator<String> itr = v.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
