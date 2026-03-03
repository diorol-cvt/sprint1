import java.util.Random;
import java.util.Scanner;
public class Game1 {
    public static void main(String[] args) {
        int step = 0;
        int personLive = 3;
        int sizeboard = 5;
        int personX = 0;
        int personY = 0;
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
        for (int x = 0; x < sizeboard; x++) {
            for (int y = 0; y < sizeboard; y++) {
                board[x][y] = "  ";
            }
        }
        int countMonster = sizeboard * (sizeboard - 3) - 1;
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
                        board[personX][personY] = person;
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
                        System.out.println("Координаты персонажа: X = " + personX + ", Y = " + personY);
                        System.out.println("Введи новые координаты через пробел(Например: 0 1).");
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        if (x != personX && y != personY || (x < 0 || y < 0)) {
                            System.out.println("Такой ход невозможен!");
                        }
                        else {
                            if (Math.abs(personX - x) == 1 || Math.abs(personY - y) == 1) {
                                if (board[x][y].equals("  ")) {
                                    board[personX][personY] = "  ";
                                    step += 1;
                                    personX = x;
                                    personY = y;
                                    System.out.println("Номер хода: " + step + "\nКоординаты персонажа: " + personX + ", " + personY);
                                } else {
                                    if (board[x][y].equals(castle)) {
                                        System.out.println("Вы прошли игру!");
                                        break;
                                    }
                                    else {
                                        int count = 3;
                                        System.out.println("Решите задачу.");
                                        System.out.println("Количество попыток: " + count);
                                        int a = random.nextInt(200);
                                        int b = random.nextInt(200);
                                        int trueAnswer = a + b;
                                        System.out.println(a + " + " + b + " = ?");
                                        int ans1 = scanner.nextInt();
                                        if (trueAnswer == ans1) {
                                            System.out.println("Верно! Идем дальше!");
                                            board[personX][personY] = "  ";
                                            personX = x;
                                            personY = y;
                                        }
                                        else {
                                            count--;
                                            System.out.println("Попробуй еще раз.");
                                            System.out.println("Количество попыток: " + count);
                                            int ans2 = scanner.nextInt();
                                            if (trueAnswer == ans2) {
                                                System.out.println("Верно! Идем дальше!");
                                                board[personX][personY] = "  ";
                                                personX = x;
                                                personY = y;
                                            }
                                            else {
                                                count--;
                                                System.out.println("Попробуй еще раз.");
                                                System.out.println("Количество попыток: " + count);
                                                int ans3 = scanner.nextInt();
                                                if (trueAnswer == ans3) {
                                                    System.out.println("Верно! Идем дальше!");
                                                    board[personX][personY] = "  ";
                                                    personX = x;
                                                    personY = y;
                                                }
                                                else {
                                                    personLive--;
                                                    System.out.println("Попытки закончились. Идем дальше.");
                                                    board[personX][personY] = "  ";
                                                    personX = x;
                                                    personY = y;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                System.out.println("Координаты не изменились.");
                            }
                            if (personLive <= 0) {
                                System.out.println("Жизни закончились. Ваш результат: ");
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("Такого уровня нет!");
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