import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Hello world");

        int R = 5;
        double V = (4.0 / 3.0) * Math.PI * R * R * R;
        System.out.println(V);

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

        double a = 1;
        double b = 2;
        double c = 3;
        double result1 = a + 2;
        double result2 = result1 * b;
        double result3 = result2 - c;
        double result4 = result3 / b;
        double result5 = b * c;
        double result6 = result4 + result5;
        System.out.println(result6);


        int a1 = 1;
        int b1 = 2;
        double res1 = a1 + b1;
        double res2 = a1 - b1;
        double res3 = b1 - a1;
        double res4 = a1 * b1;
        double res5 = a1 / b1; // b1 != 0
        double res6 = a1 % b1; // b1 != 0
        double res7 = b1 / a1; // a1 != 0
        double res8 = b1 % a1; // a1 != 0
        System.out.println("a + b = " + res1);
        System.out.println("a - b = " + res2);
        System.out.println("b - a = " + res3);
        System.out.println("a * b = " + res4);
        System.out.println("a / b = " + res5);
        System.out.println("a % b = " + res6);
        System.out.println("b / a = " + res7);
        System.out.println("b % a = " + res8);

        int n = 2;
        int k = 1;
        while (n <= 9 & n >= 2) {
            System.out.println(n + " x " + k + " = " + k * n);
            n += 1;
        }

        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        double y1;
        if (x1 > 2) {
            y1 = (x1 * x1 - 1) / (x1 + 2); // x1 != -2
        }
        if (x1 > 0 & x1 <= 2) {
            y1 = (x1 * x1 - 1) * (x1 + 2);
        }
        else {
            y1 = (x1 * x1 * (1 + 2 * x));
        }
        System.out.println(y1);
    }
}
