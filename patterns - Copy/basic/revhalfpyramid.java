
public class revhalfpyramid {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}
