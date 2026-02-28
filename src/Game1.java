import java.util.Random;
import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        int step = 0;
        int personLive = 3;
        int sizeboard = 5;
        int personX = 5;
        int personY = 5;
        int castleY = 1;
        Random random = new Random();
        int castleX = 1 + random.nextInt(sizeboard);
        String castle = "\uD83C\uDFF0";
        String person = "\uD83E\uDDD9\u200D";
        String monster = "\uD83E\uDDDF\u200D";
        String gamingField = "  Y"
                           + "+ —— + —— + —— + —— + —— + \n"
                           + "|    |    |    |    |    | \n"
                           + "+ —— + —— + —— + —— + —— + \n"
                           + "|    |    |    |    |    | \n"
                           + "+ —— + —— + —— + —— + —— + \n"
                           + "|    |    |    |    |    | \n"
                           + "+ —— + —— + —— + —— + —— + \n"
                           + "|    |    |    |    |    | \n"
                           + "+ —— + —— + —— + —— + —— + \n"
                           + "|    |    |    |    |    | \n"
                           + "+ —— + —— + —— + —— + —— +  X";
        String leftBlock = " | ";
        String rightBlock = " |";
        String wall = " + —— + —— + —— + —— + —— + ";
        System.out.println("Привет! Начнем игру? (Напиши ДА или НЕТ)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        System.out.println("Ваш ответ: " + answer);
        switch (answer) {
            case "ДА":
                System.out.println("Вперед к победе!");
                System.out.println("Выбери уровень сложности игры(от 1 до 4):");
                int difficultGame = scanner.nextInt();
                while (true) {
                    if (difficultGame <= 5 && difficultGame >= 1) {
                        switch (difficultGame) {
                            case 1:
                                System.out.println("Количество жизней: " + personLive);
//                                System.out.println(gamingField);
                                for (int x = 1; x <= sizeboard; x++) {
                                    System.out.println(wall);
                                    for (int y = 1; y <= sizeboard; y++) {
                                        System.out.print(leftBlock);
                                        if (personY == y && personX == x) {
                                            System.out.print(person);
                                        }
                                        else {
                                            if (castleX == x && castleY == y) {
                                                System.out.print(castle);
                                            }
                                            else {
                                                System.out.print("  ");
                                            }
                                        }
                                    }
                                    System.out.println(rightBlock);
                                }
                                System.out.println(wall);
                                System.out.println("Начальные координаты персонажа: X = " + personX + ", Y = " + personY);
                                System.out.println("Введи новые координаты через пробел(Например: 0 1).");
                                int x = scanner.nextInt();
                                int y = scanner.nextInt();
                                if (x != personX && y != personY) {
                                    System.out.println("Такой ход невозможен!");
                                } else {
                                    if (Math.abs(personX - x) == 1 || Math.abs(personY - y) == 1) {
                                        step += 1;
                                        personX = x;
                                        personY = y;
                                        System.out.println("Номер хода: " + step + "\nНовые координаты: " + personX + ", " + personY);
                                    } else {
                                        System.out.println("Координаты не изменились.");
                                    }
                                }
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    }
                    else {
                        System.out.println("Такого уровня нет!");
                    }
                if (personLive <= 0) {
                    break;
                }
                }
                System.out.println("Жизни закончились. Ваш результат: ");
                break;
            case "НЕТ":
                System.out.println("Возвращайся, сыграем позже.");
                break;
            default:
                System.out.println("Неверный ввод.");
        }


    }
}
