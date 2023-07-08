package binarysearchtree;

import java.util.*;

public class bst {

  static class Node {

    int data;
    Node left, right;

    public Node(int d) {
      data = d;
    }
  }

  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }
    if (root.data > val) {
      root.left = insert(root.left, val);
    }
    if (root.data < val) {
      root.right = insert(root.right, val);
    }
    return root;
  }

  //to see the result we use inorder method to get sorted vals:
  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  //search in bst O(H)

  public static boolean search(Node root, int key) {
    if (root == null) {
      return false;
    } else if (root.data == key) {
      return true;
    } else if (root.data > key) {
      return search(root.left, key);
    } else {
      return search(root.right, key);
    }
  }

  //delete in bst

  public static Node delete(Node root, int val) {
    if (root.data > val) {
      root.left = delete(root.left, val);
    } else if (root.data < val) {
      root.right = delete(root.right, val);
    } else { //root.data==val
      //case 1: no child /reaches leafe node
      if (root.left == null && root.right == null) {
        return null;
      }
      //case 2; one child
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }
      //case 3: two child
      Node Is = inordersuccessor(root.right);
      //place inorder data in root
      root.data = Is.data;
      //pass inordersucc in place of right root

      root.right = delete(root.right, Is.data); //remove right node
    }
    return root;
  }

  public static Node inordersuccessor(Node root) {
    while (root.left != null) {
      root = root.left;
    }
    return root;
  }

  //print in range
  public static void printinrange(Node root, int x, int y) {
    //base case:
    if (root == null) {
      return;
    }
    // case1:
    if (root.data >= x && root.data <= y) {
      printinrange(root.left, x, y);
      System.out.print(root.data + " ");
      printinrange(root.right, x, y);
      //c2
    } else if (root.data <= y) {
      printinrange(root.right, x, y);
      //c3
    } else {
      printinrange(root.left, x, y);
    }
  }

  //sum inrange
  public static int suminrange(Node root, int x, int y) {
    if (root == null) {
      return 0;
    }
    int sum = 0;
    if (root.data >= x && root.data <= y) {
      sum = sum + suminrange(root.left, x, y);
      sum = sum + root.data;
      sum = sum + suminrange(root.right, x, y);
    }
    if (root.data > x) {
      sum += suminrange(root.left, x, y);
    }
    if (root.data < y) {
      sum += suminrange(root.right, x, y);
    }
    return sum;
  }

  //print from root to leaf
  public static void printpath(ArrayList<Integer> path) {
    for (int i = 0; i < path.size(); i++) {
      System.out.print(path.get(i) + "->");
    }
    System.out.println();
  }

  public static void printroot2leaf(Node root, ArrayList<Integer> path) {
    //is a preorder traversal
    if (root == null) {
      return;
    }
    path.add(root.data);
    if (root.left == null && root.right == null) {
      printpath(path);
    } else {
      printroot2leaf(root.left, path);
      printroot2leaf(root.right, path);
    }
    path.remove(path.size() - 1);
  }

  public static void main(String[] args) {
    int values[] = { 8, 5, 1, 3, 4, 2, 7, 6, 10, 11, 14 };
    Node root = null;
    //to insert in bst
    for (int i = 0; i < values.length; i++) {
      root = insert(root, values[i]);
    }
    inorder(root);
    System.out.println();
    if (search(root, 4)) {
      System.out.println("found");
    } else {
      System.out.println("not found");
    }
    System.out.println();
    // delete(root, 8);

    inorder(root);
    System.out.println();
    printinrange(root, 3, 8);
    System.out.println();
    printroot2leaf(root, new ArrayList<>());
    System.out.println("hey");
    suminrange(root, 3, 8);
    System.out.println();
  }
}
// inorder sucessor = left most in right subtree
