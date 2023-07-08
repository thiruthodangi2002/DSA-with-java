package cycle;

import java.util.ArrayList;

public class iscycledirected {

  static class Edge {

    int src, dest;

    public Edge(int s, int d) {
      src = s;
      dest = d;
    }
  }

  public static void Creategraph(ArrayList<Edge> Graph[]) {
    for (int i = 0; i < Graph.length; i++) {
      Graph[i] = new ArrayList<Edge>();
    }
    Graph[0].add(new Edge(0, 2));

    Graph[1].add(new Edge(1, 0));

    Graph[2].add(new Edge(2, 3));
    Graph[3].add(new Edge(3, 0));
  }

  public static boolean Iscycledirected(
    ArrayList<Edge> Graph[],
    boolean vis[],
    boolean rec[],
    int curr
  ) {
    vis[curr] = true;
    rec[curr] = true;
    for (int i = 0; i < Graph[curr].size(); i++) {
      Edge e = Graph[curr].get(i);
      if (rec[e.dest]) {
        //cycle
        return true;
      } else if (!vis[e.dest]) {
        if (Iscycledirected(Graph, vis, rec, e.dest)) {
          return true;
        }
      }
    }
    rec[curr] = false;
    return false;
  }

  public static void main(String[] args) {
    int V = 4;
    ArrayList<Edge> Graph[] = new ArrayList[V];
    boolean vis[] = new boolean[V];
    boolean rec[] = new boolean[V];
    Creategraph(Graph);
    for (int i = 0; i < V; i++) {
      boolean cyclic = Iscycledirected(Graph, vis, rec, i);
      if (cyclic) {
        System.out.println(cyclic);
        break;
      }
    }
  }
}
