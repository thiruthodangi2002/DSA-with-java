package Recursion.top9;

public class subseq {
    public static void subseq(String str, int idx, String newstring) {
        if (idx == str.length()) {
            System.out.print(newstring + " ");
            return;
        }
        char currchar = str.charAt(idx);

        // two choices
        // curr wants to add in newstring
        subseq(str, idx + 1, newstring + currchar);
        // dont want
        subseq(str, idx + 1, newstring);

    }

    public static void main(String[] args) {
        String str = "abc";
        subseq(str, 0, "");

    }

}
