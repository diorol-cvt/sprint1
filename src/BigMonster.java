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
    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу.");
        if (difficultGame == 1) {

        }
        else {
            if (difficultGame == 2) {

            }
            else {
                if (difficultGame == 3) {

                }
                else {
                    if (difficultGame == 4) {

                    }
                    else {

                    }
                }
            }
        }
        return false;
    }
    public boolean taskMonster() {
        return super.taskMonster(1);
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