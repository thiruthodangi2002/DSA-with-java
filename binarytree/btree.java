package binarytree;

import java.util.*;
import java.util.LinkedList;

public class btree {

  static class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  /// creatihg a binarytree
  static class BinaryTree {

    static int idx = -1;

    public static Node buildtree(int nodes[]) {
      idx++;
      if (nodes[idx] == -1) {
        return null;
      }
      Node newNode = new Node(nodes[idx]);
      newNode.left = buildtree(nodes);
      newNode.right = buildtree(nodes);
      return newNode;
    }
  }

  // preorder traversal ->>> root leftsub rightsub O(n);
  public static void preorder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  /// inorder
  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  // postorder
  public static void postorder(Node root) {
    if (root == null) {
      return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
  }

  /// levelorder
  public static void levelorder(Node root) {
    if (root == null) {
      return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while (!q.isEmpty()) {
      Node curr = q.remove();
      if (curr == null) {
        System.out.println();
        if (q.isEmpty()) { // for last element
          break;
        } else {
          q.add(null);
        }
      } else {
        System.out.print(curr.data + " ");
        if (curr.left != null) {
          q.add(curr.left);
        }
        if (curr.right != null) {
          q.add(curr.right);
        }
      }
    }
  }

  // count no of nodes
  public static int countnoofnodes(Node root) {
    if (root == null) {
      return 0;
    }
    int leftNodes = countnoofnodes(root.left);
    int rightNodes = countnoofnodes(root.right);
    return leftNodes + rightNodes + 1;
  }

  // sum of the nodes
  public static int sumofnodes(Node root) {
    if (root == null) {
      return 0;
    }
    int leftsubsum = sumofnodes(root.left);
    int rightsubsum = sumofnodes(root.right);
    return leftsubsum + rightsubsum + root.data;
  }

  // height of the tree
  public static int height(Node root) {
    if (root == null) {
      return 0;
    }
    int leftheight = height(root.left);
    int rightheight = height(root.right);
    int treeheight = Math.max(leftheight, rightheight) + 1;
    return treeheight;
  }

  // diameter O(n^2)
  public static int diameter(Node root) {
    if (root == null) {
      return 0;
    }
    int diam1 = diameter(root.left);
    int diam2 = diameter(root.right);
    int diam3 = height(root.left) + height(root.right) + 1;
    return Math.max(diam1, Math.max(diam2, diam3));
  }

  // diameter O(n)
  static class treeinfo {

    int ht;
    int diam;

    treeinfo(int ht, int diam) {
      this.ht = ht;
      this.diam = diam;
    }
  }

  public static treeinfo diameter2(Node root) {
    if (root == null) {
      return new treeinfo(0, 0);
    }
    treeinfo left = diameter2(root.left);
    treeinfo right = diameter2(root.right);
    int myheight = Math.max(left.ht, right.ht) + 1;
    // of subtrees
    int diam1 = left.diam;
    int diam2 = right.diam;
    int diam3 = left.ht + right.ht + 1;
    int mydiam = Math.max(diam1, Math.max(diam2, diam3));
    treeinfo myinfo = new treeinfo(myheight, mydiam);
    return myinfo;
  }

  public static void main(String[] args) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();

    Node root = tree.buildtree(nodes);
    System.out.println(root.data);
    preorder(root);
    System.out.println();
    inorder(root);
    System.out.println();
    postorder(root);
    System.out.println();
    levelorder(root);
    System.out.println();
    System.out.println(countnoofnodes(root));
    System.out.println();
    System.out.println(sumofnodes(root));
    System.out.println();
    System.out.println(height(root));
    System.out.println();
    System.out.print(diameter(root));
    System.out.println();
    System.out.println(diameter2(root).diam);
    System.out.println();
  }
}
// depth first tree= postorder,preorder,inorder ==time O(n)
/// bfs=level order
// -1 is null nodes
// time O(n) for all
