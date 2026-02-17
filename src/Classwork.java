import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        boolean flag = answer.equals("ДА");
        if (flag) {
            System.out.println("Hello in game");
            System.out.println("Enter x");
            int x = scanner.nextInt();
            if (x < 0 || x > 10) {
                System.out.println("Success");
            }
        } else {
            if (answer.equals("НЕТ")) {
                System.out.println("Goodbye");}
            else {
                System.out.println("Error");
            }
        }

        System.out.println("The end");
    }
}
