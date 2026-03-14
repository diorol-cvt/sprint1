package Homework;

import java.util.Scanner;

public class Hw011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = 1;
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                f *= i;
            }
        }
        else {
            for (int i = 1; i <= n; i += 2) {
                f *= i;
            }
        }
        System.out.println(f);
    }
}
