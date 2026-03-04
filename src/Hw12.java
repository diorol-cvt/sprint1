import java.util.Scanner;

public class Hw12 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;
        for (int j = 3; j < 1 + 2 * n; j += 4) {
            count -= 1 / j;
        }
    }
}