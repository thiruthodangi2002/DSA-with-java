import java.util.*;

public class creategraph {

  static class Edge {

    int src, dest, weight;

    public Edge(int s, int d, int w) {
      src = s;
      dest = d;
      weight = w;
    }
  }

  public static void Creategraph(ArrayList<Edge> Graph[]) {
    for (int i = 0; i < Graph.length; i++) {
      Graph[i] = new ArrayList<Edge>();
    }
    Graph[0].add(new Edge(0, 2, 2));

    Graph[1].add(new Edge(1, 2, 10));
    Graph[1].add(new Edge(1, 3, 0));

    Graph[2].add(new Edge(2, 0, 2));
    Graph[2].add(new Edge(2, 1, 10));
    Graph[2].add(new Edge(2, 3, 1));

    Graph[3].add(new Edge(0, 1, 0));
    Graph[3].add(new Edge(0, 2, 1));
  }

  public static void main(String[] args) {
    int V = 4;
    ArrayList<Edge> Graph[] = new ArrayList[V];
    Creategraph(Graph);
    for (int i = 0; i < Graph[2].size(); i++) {
      Edge e = Graph[2].get(i);
      System.out.println(e.dest + " ," + e.weight);
    }
  }
}
