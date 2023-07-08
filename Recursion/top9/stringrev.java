package Recursion.top9;

public class stringrev {
    public static void strrev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        strrev(str, idx - 1);

    }

    public static void main(String[] args) {
        String str = "thiru";
        strrev(str, str.length() - 1);

    }
}
