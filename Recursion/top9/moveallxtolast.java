package Recursion.top9;

public class moveallxtolast {
    public static void moveallxtolast(String str, int count, int id, String newString) {
        if (id == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currchar = str.charAt(id);
        if (currchar == 'x') {
            count++;
            moveallxtolast(str, count, id + 1, newString);
        } else {
            newString += currchar;
            moveallxtolast(str, count, id + 1, newString);
        }

    }

    public static void main(String[] args) {
        String str = "xxThiruxx";
        moveallxtolast(str, 0, 0, "");

    }
}
