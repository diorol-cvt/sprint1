package Homework;

import java.util.Scanner;

public class Hw12 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int k = 0; k < n; k++) {
            for (int i = 1; i < 2 * n; i += 4) {
                sum += 1 / i;
            }
            for (int j = 3; j < 2 * n; j += 4) {
                sum -= 1 / j;
            }
        }
        System.out.println(sum);
    }
}