import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        int step = 0;
        int personLive = 3;
        int sizeboard = 5;
        int personX = 1;
        int personY = sizeboard;
        int castleY = 0;
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
        for (int i = 0; i <= countMonster; i++) {
            board[random.nextInt(sizeboard - 1)][random.nextInt(sizeboard)] = monster;
        }
        board[castleY][castleX] = castle;
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
                        outputboard(board);
                        System.out.println("Количество жизней: " + personLive);
                        System.out.println("Координаты персонажа: X = " + personX + ", Y = " + personY);
                        System.out.println("Введи новые координаты через пробел(Например: 1 2).");
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        if (x != personX && y != personY || x < 1 || y < 1 || y > 5 || x > 5) {
                            System.out.println("Такой ход невозможен!");
                        } else {
                            if (Math.abs(personX - x) == 1 || Math.abs(personY - y) == 1) {
                                if (board[y - 1][x - 1].equals("  ")) {
                                    board[personY - 1][personX - 1] = "  ";
                                    step += 1;
                                    personX = x;
                                    personY = y;
                                    System.out.println("Номер хода: " + step + "\nКоординаты персонажа: " + personX + ", " + personY);
                                } else {
                                    if (board[y - 1][x - 1].equals(castle)) {
                                        System.out.println("Вы прошли игру!");
                                        break;
                                    } else {
                                        if (taskMonster(difficultGame)) {
                                            board[personY - 1][personX - 1] = "  ";
                                            personX = x;
                                            personY = y;
                                        }
                                        else {
                                            board[personY - 1][personX - 1] = "  ";
                                            personX = x;
                                            personY = y;
                                            personLive--;
                                        }
                                    }
                                }
                            } else {
                                System.out.println("Координаты не изменились.");
                            }
                            if (personLive <= 0) {
                                System.out.println("Жизни закончились. Ваш результат: ");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Такого уровня нет!");
                        break;
                    }
                }
                break;
            case "НЕТ":
                System.out.println("Возвращайся, сыграем позже.");
                break;
            default:
                System.out.println("Неверный ввод.");
        }
    }

    static boolean taskMonster(int difficultGame) {
        if (difficultGame == 1) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int count = 3;
            System.out.println("Решите задачу.");
            System.out.println("Количество попыток: " + count);
            int a = random.nextInt(200);
            int b = random.nextInt(200);
            int trueAnswer = a + b;
            System.out.println(a + " + " + b + " = ?");
            while (count > 0) {
                int ans1 = scanner.nextInt();
                if (trueAnswer == ans1) {
                    System.out.println("Верно! Идем дальше!");
                    return true;
                } else {
                    System.out.println("Попробуй еще раз.");
                    count--;
                    System.out.println("Количество попыток: " + count);
                }
            }
            System.out.println("Попытки закончились.");
        }
        return false;
    }

    static void outputboard(String[][] board) {
        String leftBlock = "| ";
        String rightBlock = "|";
        String wall = "+ —— + —— + —— + —— + —— +";

        for (String[] raw : board) {
            System.out.println(wall);
            for (String col : raw) {
                System.out.print(leftBlock + col + " ");
            }
            System.out.println(rightBlock);
        }
        System.out.println(wall);
    }
}