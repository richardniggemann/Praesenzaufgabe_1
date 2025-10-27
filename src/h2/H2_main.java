package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        int i = 0, j = 1, k = 2, min, max;
        int[] values = {i, j, k};
        Arrays.sort(values);
        min = values[0];
        max = values[values.length - 1];
    }
}
