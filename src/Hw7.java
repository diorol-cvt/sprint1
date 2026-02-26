import java.util.Scanner;

public class Hw7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y;
        if (x > 2) {
            y = (x * x - 1) / (x + 2); // x != -2
        }
        if (x > 0 & x <= 2) {
            y = (x * x - 1) * (x + 2);
        }
        else {
            y = (x * x * (1 + 2 * x));
        }
        System.out.println(y);
    }
}
