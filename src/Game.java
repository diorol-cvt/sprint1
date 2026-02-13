import java.util.Random;
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
        String answer = Scanner.nextLine();
        switch (answer) {
            case "ДА":
                // …
                break
            case "НЕТ":
                System.out.println("Жаль, приходи еще!");
                break;
            default:
                System.out.println("Данные введены некорректно");
        }
        System.out.println("Количество жизней: " + personLive);
        System.out.println("Количество жизней: " + personLive + " " + person);
        //Scanner scanner = new Scanner(System.in);
        //String answer = scanner.nextLine();
        //personLive = scanner.nextInt();
        //System.out.println("Ваш ответ:\t" + answer);
        int x = Scanner.nextInt();
        int y = Scanner.nextInt();
        if (x != personX && y != personY) {
            System.out.println("Некорректный ход");
        } else if (Math.abs(x - personX) == 1) {
            personX = x;
            step += 1;
        } else if (Math.abs(y - personY) == 1) {
            personY = y;
            step += 1;
        } else {
            System.out.println("Координаты не изменены");
        }
        int size = Scanner;
        String castle = "\uD83C\uDFF0";
        Random random = new Random();
        int castleX = 1 + random.nextInt();
        int castleY = 1 + random.nextInt();
        while (true) {
            if (personLive <= 0) {
                break;
            }
        }
        System.out.println("Закончилиь жизни. Итог: ...");
        int counterY = 1;
        while (counterY <= size) {
            // ...
            counterY += 1;
        String leftBlock = " | ";
        String rightBlock = " |";
        String wall = " + —— + —— + —— + —— + —— + ";
        for (int y = 1; y <= size; y++) {
            System.out.println(wall);
            for (int x = 1; x <= size; x++) {
                System.out.print(leftBlock);
                if (personY == y && personX == x) {
                    System.out.print(person);
                } else if (castleX == x && castleY == y) {
                    System.out.print(castle);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(rightBlock);
        }
        System.out.println(wall);
        }

    }
}