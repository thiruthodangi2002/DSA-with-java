package Recursion.advance;

public class allpathsinmaze {
    public static int paths(int n, int m, int i, int j) {
        if (i == n || j == m) {// means boundries
            return 0;
        }
        if (i == n - 1 && i == m - 1) {// means des
            return 1;
        }
        // down
        int down = paths(n, m, i + 1, j);
        // right
        int right = paths(n, m, i, j + 1);
        return down + right;

    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(paths(n, m, 0, 0));

    }

}
