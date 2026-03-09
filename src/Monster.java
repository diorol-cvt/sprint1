import java.util.Random;
import java.util.Scanner;
public class Monster {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private String image = "\uD83E\uDDDF\u200D";
    private final int x, y;

    Monster(int sizeboard) {
        this.y = random.nextInt(sizeboard - 1);
        this.x = random.nextInt(sizeboard);
    }

    public String getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean conflict(int perX, int perY) {
        return perX - 1 == this.x && perY - 1 == this.y;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу. Количество попыток: 3");
        if (difficultGame == 1) {
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            int trueAnswer = a + b;
            System.out.println(a + " + " + b + " = ?");
            if (check(trueAnswer)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (difficultGame == 2) {
                int a = random.nextInt(150);
                int b = random.nextInt(150);
                int trueAnswer = a + b;
                System.out.println(a + " + " + b + " = ?");
                if (check(trueAnswer)) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                if (difficultGame == 3) {
                    int a = random.nextInt(200);
                    int b = random.nextInt(200);
                    int trueAnswer = a + b;
                    System.out.println(a + " + " + b + " = ?");
                    if (check(trueAnswer)) {
                        return true;
                    }
                    else {
                        return false;
                    }

                }
                else {
                    if(difficultGame == 4) {
                        int a = random.nextInt(250);
                        int b = random.nextInt(250);
                        int trueAnswer = a + b;
                        System.out.println(a + " + " + b + " = ?");
                        if (check(trueAnswer)) {
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                    else {
                        int a = random.nextInt(300);
                        int b = random.nextInt(300);
                        int trueAnswer = a + b;
                        System.out.println(a + " + " + b + " = ?");
                        if (check(trueAnswer)) {
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                }
            }
        }
    }
    public boolean check(int trueAnswer) {
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
