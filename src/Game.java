import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int personX;
        int personY;
        int step = 0;
        int personLive = 3;
        int sizeBoard = 5;
        personX = 1 + sizeBoard / 2;
        personY = 1 + sizeBoard / 2;
        step += 1;
        //step -= 10; эквивалентно: step = step - 10
        //step *= 5;  эквивалентно: step = step * 5
        //step /= 2;  эквивалентно: step = step / 2
        String person = "Г";
        String monster = "Мм";
        String gamingField = "+ —— + —— + —— +\n"
                + "|    |    |    |\n"
                + "+ —— + —— + —— +\n"
                + "|    | " + monster + " |    |\n"
                + "+ —— + —— + —— +\n"
                + "| " + person + " |    |    |\n"
                + "+ —— + —— + —— +";
        System.out.println("Привет! Ты готов начать играть в игру? (Напиши: ДА или НЕТ)");
        System.out.println("Количество жизней: " + personLive);
        System.out.println("Количество жизней: " + personLive + " " + person);
        //Scanner scanner = new Scanner(System.in);
        //String answer = scanner.nextLine();
        //personLive = scanner.nextInt();
        //System.out.println("Ваш ответ:\t" + answer);
    }
}