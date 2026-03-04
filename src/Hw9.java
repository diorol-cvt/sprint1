import java.util.Scanner;

public class Hw9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;
        if (x > 2) {
            y = (x * x - 1) / (x + 2);
        }
        else {
            if (x > 0 & x <= 2) {
                y = (x * x - 1) * (x + 2);
            }
            else {
                y = x * x * (1 + 2 * x);
            }
        }
        System.out.println(y);
    }
}
