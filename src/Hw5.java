public class Hw5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        double res1 = a + b;
        double res2 = a - b;
        double res3 = b - a;
        double res4 = a * b;
        double res5 = a / b; // b != 0
        double res6 = a % b; // b != 0
        double res7 = b / a; // a != 0
        double res8 = b % a; // a != 0
        System.out.println("a + b = " + res1);
        System.out.println("a - b = " + res2);
        System.out.println("b - a = " + res3);
        System.out.println("a * b = " + res4);
        System.out.println("a / b = " + res5);
        System.out.println("a % b = " + res6);
        System.out.println("b / a = " + res7);
        System.out.println("b % a = " + res8);
    }
}
