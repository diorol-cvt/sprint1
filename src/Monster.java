import java.util.Random;
import java.util.Scanner;
public abstract class Monster {
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
        int a = random.nextInt(150);
        int b = random.nextInt(150);
        int trueAnswer = a + b;
        int count = 3;
        System.out.println(a + " + " + b + " = ?");
        int ans = scanner.nextInt();
        if (ans == trueAnswer) {
            System.out.println("Верно! Идем дальше!");
            return true;
        }
        else {
            System.out.println("Ответ не верный. Идем дальше.");
        }
        return false;
    }

    public abstract boolean taskMonster();
}
