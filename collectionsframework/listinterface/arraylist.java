package collectionsframework.listinterface;

import java.util.*;

public class arraylist {

  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    //add elements
    list1.add(125);
    list1.add(113);
    list1.add(21);
    list1.add(500);
    //get elements
    int a = list1.get(0);
    int b = list1.get(2);
    System.out.println(a);
    System.out.println(b);

    //set element
    list1.add(0, 100);
    System.out.println(list1);
    list1.remove(3);
    System.out.println(list1);
    //size
    int size = list1.size();
    System.out.println(size);
    // for (int i = 0; i < size; i++) {
    //   System.out.print(list1.get(i) + " ");
    // }
    Iterator<Integer> itr= list1.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    //sort
    Collections.sort(list1);
    System.out.println(list1);
    //list2
    list2.add("thiru");
    System.out.println(list2);
  }
}
