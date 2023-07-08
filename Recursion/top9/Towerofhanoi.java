package Recursion.top9;

public class Towerofhanoi {
    public static void towerofhanoi(int n, String scr, String helper, String des) {
        //basecase
        if (n == 1) {
            System.out.println("transfer disk" + n + "from" + scr + "to" + des);
            return;

        }
        // if n value is more than 1
        towerofhanoi(n - 1, scr, des, helper);
        System.out.println("transfer disk" + n + "from" + scr + "to" + des);
        towerofhanoi(n - 1, helper, scr, des);

    }

    public static void main(String[] args) {
        int n = 2;
        towerofhanoi(n, "s", "h", "des");

    }

}
