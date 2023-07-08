package bitmanipulation;

import java.util.*;

public class update {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        int n = sc.nextInt();
        System.out.println("enter position to be shiftered:");
        int pos = sc.nextInt();
        System.out.println("enter operation ");
        int oper = sc.nextInt();
        int bitmask = 1 << pos;
        if (oper == 1) {
            // set
            int newnumber = n | bitmask;
            System.out.println(newnumber);

        } else {
            // clear
            int newbitmask = ~(bitmask);
            int newnumber = newbitmask & n;
            System.out.println(newnumber);

        }

    }

}
