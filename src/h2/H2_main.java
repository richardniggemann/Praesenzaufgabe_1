package h2;

import java.util.List;
import java.util.stream.Stream;

public class H2_main {
    public static void main(String[] args) {
        int i = 0, j = 1, k = 2, min, max;

        List<Integer> values = Stream.of(i, j, k).sorted().toList();
        min = values.getFirst();
        max = values.getLast();
    }
}
