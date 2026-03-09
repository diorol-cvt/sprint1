package Homework;

import java.util.Scanner;
public class Hw11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                result *= i;
            }
        }
        else {
            for (int i = 1; i <= n; i += 2) {
                result *= i;
            }
        }
        System.out.println(result);
    }
}
