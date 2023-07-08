package linkedlist;

//create  a linked list with add,del ans size method
import java.util.*;

public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    // create a node that contain data and next
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add --first ,last
    public void addfirst(String data) {
        Node newNode = new Node(data);
        // if no node exist
        if (head == null) {
            head = newNode;
            return;
        }
        // if already a list exist we want to add element at first
        newNode.next = head;
        // after that we make newnode as head
        head = newNode;

    }

    public void addlast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    // delete first ,last
    public void deletefirst() {
        if (head == null) {
            System.out.println("the list is empty:");
            return;
        }
        size--;
        head = head.next;

    }

    public void deletelast() {
        // if no elements
        if (head == null) {
            System.out.println("the list is empty:");
            return;
        }
        size--;
        // if one element
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;

    }

    public int getsize() {
        return size;
    }

    // rev ll
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) { // 4 3 2 1 null ->>
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // updation
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null; // means pointing towards null not assigning
        head = prevNode;

    }

    // recurive rev
    public Node reversrecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reversrecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }

    // print
    public void printlist() {
        if (head == null) {
            System.out.println("list is empty:");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.print("null" + " ");

    }

    public static void main(String[] args) {
        LL list = new LL();
        // list.addfirst("this");
        // list.addfirst("a");
        // list.addfirst("is");
        // list.printlist();
        // System.out.println();
        // list.addlast("list");
        // list.printlist();
        // System.out.println();
        // list.deletefirst();
        // list.printlist();
        // System.out.println();
        // list.deletelast();
        // list.printlist();
        // System.out.println();
        // System.out.print(list.getsize());
        // list.addfirst("ofstrings");
        // list.printlist();
        // System.out.println(list.getsize());
        // System.out.println();
        list.addlast("1");
        list.addlast("2");
        list.addlast("3");
        list.addlast("4");
        list.printlist();
        System.out.println();
        list.reverseIterate();
        list.printlist();
        // // System.out.println();
        // list.head = list.reversrecursive(list.head);
        // list.printlist();

    }

}
