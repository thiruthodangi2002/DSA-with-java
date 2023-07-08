package Recursion.advance;

public class placetiles {
    public static int placetiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        // vertically
        int vertically = placetiles(n - m, m);
        // horizentally
        int horizentally = placetiles(n - 1, m);
        return vertically + horizentally;

    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println("total no of ways:" + placetiles(n, m));

    }

}
