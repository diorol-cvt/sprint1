import java.util.Random;
import java.util.Scanner;

public class BigMonster extends Monster {
    private String image = "\uD83D\uDC79";
    BigMonster(int sizeBoard) {
        super(sizeBoard);
    }

    public String getImage(){
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    @Override
    public static boolean taskMonster(int difficultGame) {
        Random random = new Random();
        System.out.println("Решите задачу.");
        int trueAnswer;
        int a, b, c;
        if (difficultGame == 1) {
            a = random.nextInt(300);
            b = random.nextInt(300);
            c = random.nextInt(300);
            trueAnswer = a + b - c;
            System.out.println(a + " + " + b + " - " + c + " = ?");
            check(trueAnswer);
        }
        else {
            if (difficultGame == 2) {
                a = random.nextInt(9) + 1;
                b = random.nextInt(9) + 1;
                trueAnswer = a * b;
                System.out.println(a + " x " + b + " = ?");
                check(trueAnswer);
            }
            else {
                if (difficultGame == 3) {
                    a = random.nextInt(15) + 1;
                    b = random.nextInt(15) + 1;
                    trueAnswer = (a - b) * (a + b);
                    System.out.println("(" + a + " - " + b + ") x (" + a + " + " + b + ") = ?");
                    check(trueAnswer);
                }
                else {
                    if (difficultGame == 4) {
                        a = random.nextInt(20) + 1;
                        b = random.nextInt(20) + 1;
                        c = random.nextInt(1000);
                        trueAnswer = c - a * b;
                        System.out.println(c + " - " + a + " x " + b + " = ?");
                        check(trueAnswer);
                    }
                    else {
                        int count = 1;
                        a = random.nextInt(10);
                        b = random.nextInt(4) + 1;
                        for (int i = b; i > 0; i--) {
                            count *= a;
                        }
                        trueAnswer = count;
                        System.out.println(a + " ^ " + b + " = ?");
                        check(trueAnswer);
                    }
                }
            }
        }
        return false;
    }
    public boolean taskMonster() {
        return super.taskMonster(1);
    }
    public static boolean check(int trueAnswer) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count > 1) {
            int ans1 = scanner.nextInt();
            if (trueAnswer == ans1) {
                System.out.println("Верно! Идем дальше!");
                return true;
            } else {
                count--;
                System.out.println("Попробуй еще раз. Количество попыток: " + count);
            }
        }
        int ans2 = scanner.nextInt();
        if (trueAnswer == ans2) {
            System.out.println("Верно! Идем дальше!");
            return true;
        }
        else {
            System.out.println("Попытки закончились. Количество жизней уменьшилось.\nИдем дальше.");
        }
        return false;
    }
}