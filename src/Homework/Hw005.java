package Homework;

public class Hw005 {
    public static void main(String[] args) {
        //((x + 2) * y - z) / y + y * z
        double x = 1;
        double y = 2; // y != 0
        double z = 3;
        double result1 = x + 2;
        double result2 = result1 * y;
        double result3 = result2 - z;
        double result4 = result3 / y;
        double result5 = y * z;
        double result6 = result4 + result5;
        System.out.println(result6);
    }
}
