package Recursion.top9;

public class removedup {
    public static boolean[] map = new boolean[26];

    public static void removedups(String str, int idx, String newstring) {
        if (idx == str.length()) {
            System.out.println(newstring);
            return;
        }

        char curchar = str.charAt(idx);
        if (map[curchar - 'a']) {
            removedups(str, idx + 1, newstring);

        } else {
            newstring += curchar;
            map[curchar - 'a'] = true;
            removedups(str, idx + 1, newstring);

        }

    }

    public static void main(String[] args) {
        String str = "helloworld";
        removedups(str, 0, "");

    }

}
// time O[n]
