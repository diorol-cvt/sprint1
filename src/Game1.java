import java.util.Random;
import java.util.Scanner;
public class Game1 {
    public static void main(String[] args) {
        int step = 0;
        int personLive = 3;
        int sizeboard = 5;
        int personX = 1;
        int personY = 1;
        int castleY = 4;
        Random random = new Random();
        int castleX = random.nextInt(sizeboard);
        String castle = "\uD83C\uDFF0";
        String person = "\uD83E\uDDD9\u200D";
        String monster = "\uD83E\uDDDF\u200D";
        String leftBlock = " | ";
        String rightBlock = " |";
        String wall = " + —— + —— + —— + —— + —— + ";
        String[][] board = new String[sizeboard][sizeboard];
        for (int y = 0; y < sizeboard; y++) {
            for (int x = 0; x < sizeboard; x++) {
                board[y][x] = "  ";
            }
        }
        int countMonster = sizeboard * (sizeboard - 1) - 1;
        board[castleY][castleX] = castle;
        for (int i = 0; i <= countMonster; i++) {
            board[random.nextInt(sizeboard - 1)][random.nextInt(sizeboard)] = monster;
        }
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
                    if (difficultGame <= 4 && difficultGame >= 1) {
                        board[personY - 1][personX - 1] = person;
                        System.out.println("Уровень игры: " + difficultGame);
                        //                                System.out.println(gamingField);
                        for (String[] raw : board) {
                            System.out.println(wall);
                            for (String col : raw) {
                                System.out.print(leftBlock + col);
                            }
                            System.out.println(rightBlock);
                        }
                        System.out.println(wall);

                        System.out.println("Количество жизней: " + personLive);
                        System.out.println("Начальные координаты персонажа: X = " + personX + ", Y = " + personY);
                        System.out.println("Введи новые координаты через пробел(Например: 0 1).");
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        if (x != personX && y != personY || (x <= 0 || y <= 0)) {
                            System.out.println("Такой ход невозможен!");
                        }
                        else {
                            if (Math.abs(personX - x) == 1 || Math.abs(personY - y) == 1) {
                                if (board[y - 1][x - 1].equals("  ")) {
                                    board[personY - 1][personX - 1] = "  ";
                                    step += 1;
                                    personX = x;
                                    personY = y;
                                    System.out.println("Номер хода: " + step + "\nНовые координаты: " + personX + ", " + personY);
                                } else {
                                    if (board[y - 1][x - 1].equals(castle)) {
                                        System.out.println("Вы прошли игру!");
                                        break;
                                    } else {
                                        System.out.println("Решите задачу.");
                                    }
                                }
                            } else {
                                System.out.println("Координаты не изменились.");
                            }
                            if (personLive <= 0) {
                                break;
                            }
                        }
                    } else {
                        System.out.println("Такого уровня нет!");
                        break;
                    }
                    if (personLive <= 0) {
                        System.out.println("Жизни закончились. Ваш результат: ");
                        break;
                    }
                }
            case "НЕТ":
                System.out.println("Возвращайся, сыграем позже.");
                break;
            default:
                System.out.println("Неверный ввод.");
        }
    }
}