public class Hw3 {
    public static void main(String[] args) {
        // (1 - y) * (2x + y2 - (x + y) / (y + 1 / (x2 - 4)))
        // r - результат
        double x = 1; // x != -2; x != 2
        double y = 3;
        double r1 = x * x - 4;
        double r2 = 1 / r1;
        double r3 = y + r2;
        double r4 = x + y;
        double r5 = r4 / r3;
        double r6 = 2 * x + y * y;
        double r7 = r6 - r5;
        double r8 = 1 + y;
        double r9 = r8 * r7;
        System.out.println(r9);
    }
}

