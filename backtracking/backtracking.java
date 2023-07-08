package backtracking;

public class backtracking {
    public static void perm(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curchar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            perm(newString, perm + curchar, idx + 1);

        }

    }

    public static void main(String[] args) {
        String str = "abc";
        perm(str, "", 0);

    }

}
