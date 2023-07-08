package Recursion.basic;

public class sumofn {
    public static void printnum(int i, int n, int sum) {
        if (i == n) {
            sum += i; //add last element to sum
            System.out.println(sum);
            return;
        }

        sum += i;
        printnum(i + 1, n, sum);

    }

    public static void main(String[] args) {
        printnum(1, 100, 0);

    }
}
