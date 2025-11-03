package h3;

public class H3_main {
    public static void main(String[] args) {
        int i = 0, j = 1, k = -10;
        boolean expression1 = i > j;
        boolean expression2 = i > 200;
        boolean expression3 = j > 100;
        k = -10;
        if (expression1 && !expression2 && !expression3) {
            k = 1;
        }
        if (expression1 && expression2 && !expression3) {
            k = 2;
        }
        if (expression1 && expression2 && expression3) {
            k = 3;
        }
        if (!expression1 && !expression2 && !expression3) {
            k = 4;
        }
        System.out.println(k);
    }
}
