package Recursion.basic;

import strings.replace;

//to complete in logn time  
public class xpowern {
    public static int calcpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcpower(x, n / 2) * calcpower(x, n / 2);

        } else {
            return calcpower(x, n / 2) * calcpower(x, n / 2) * x;

        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(calcpower(x, n));

    }

}
