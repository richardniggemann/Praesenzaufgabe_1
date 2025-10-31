package h1;

public class H1_main {
    public static void main(String[] args) {
        int z = 42;
        z = conditionalSubstraction(z);
        System.out.println(z);
    }

    private static int conditionalSubstraction(int z) {
        return z > 10 ? z - 10 : z;
    }
}
