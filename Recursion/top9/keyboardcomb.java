package Recursion.top9;

public class keyboardcomb {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void comb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.print(combination + " ");
            return;

        }
        char currchar = str.charAt(idx);
        String mapping = keypad[currchar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            comb(str, idx + 1, combination + mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "24";
        comb(str, 0, " ");

    }
}
