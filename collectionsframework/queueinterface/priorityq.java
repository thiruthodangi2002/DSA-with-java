package collectionsframework.queueinterface;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityq {

  public static void main(String[] args) {
    PriorityQueue<String> queue = new PriorityQueue<String>();
    queue.add("thiru");
    queue.add("vijayraj");
    queue.add("raju");
    queue.add("bavana");
    System.out.println("head:" + queue.element());
    System.out.println("head:" + queue.peek());
    System.out.println("iteration");
    Iterator<String> itr = queue.iterator();
    while (itr.hasNext()) {
      System.out.print(itr.next() + " ");
    }
    queue.remove();
    queue.poll();
    System.out.println();
    System.out.println("after removing two elements:");
    Iterator<String> itr2 = queue.iterator();
    while (itr2.hasNext()) {
      System.out.print(itr2.next() + " ");
    }
  }
}
