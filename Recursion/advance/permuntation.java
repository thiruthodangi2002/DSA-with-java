package Recursion.advance;

public class permuntation {
    public static void perm(String str, String permuntation) {
        if (str.length() == 0) {
            System.out.print(permuntation + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newstring = str.substring(0, i) + str.substring(i + 1);
            perm(newstring, permuntation + currchar);

        }

    }

    public static void main(String[] args) {
        String str = "abc";
        perm(str, "");

    }

}
