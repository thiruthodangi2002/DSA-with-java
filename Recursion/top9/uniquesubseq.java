package Recursion.top9;

import java.util.*;

public class uniquesubseq {

    public static void uniquesubseq(String str, int idx, String newstring, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newstring)) {
                return;
            } else {// means firsttime
                System.out.print(newstring + " ");
                set.add(newstring);
                return;
            }

        }

        char currchar = str.charAt(idx);
        // if current char wants to add in newstring
        uniquesubseq(str, idx + 1, newstring + currchar, set);
        // if don't want to add in newstring
        uniquesubseq(str, idx + 1, newstring, set);

    }

    public static void main(String[] args) {
        String str = "abc";
        HashSet<String> set = new HashSet<>();
        uniquesubseq(str, 0, "", set);

    }

}
