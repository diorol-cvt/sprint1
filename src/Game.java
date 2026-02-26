import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int size = 5;
        int personX = 0;
        int personY = 0;
        int personLive = 3;
        int step = 0;
        for (int y = 0; y < size; y++){
            for (int x = 0; x < size; x++){

            }
        }

        String person = "\uD83E\uDDD9\u200D";
        String monster = "\uD83E\uDDDF\u200D";
        String castle = "\uD83C\uDFF0";
        String leftBlock = "| ";
        String rightBlock = " |";
        String wall = "+ —— + —— + —— + —— + —— +";
        String gamingField = "+ —— + —— + —— + —— + —— +\n"
                           + "|    |    |  " + castle + "  |    |    |\n"
                           + "+ —— + —— + —— + —— + —— +\n"
                           + "|    |    |    |    |    |\n"
                           + "+ —— + —— + —— + —— + —— +\n"
                           + "|    |    |  " + monster + "  |    |    |\n"
                           + "+ —— + —— + —— + —— + —— +\n"
                           + "|    |    |    |    |    |\n"
                           + "+ —— + —— + —— + —— + —— +\n"
                           + "|  " + person + "  |    |    |    |    |\n"
                           + "+ —— + —— + —— + —— + —— +";
        String[][] board = new String[size][size];
        int countMonster = size * (size - 1) - 1;
        Random random = new Random();
        for (int i = 0; i <= countMonster; i++) {
            board[random.nextInt(size - 1)][random.nextInt(size)] = monster;
        }
        int castleX = random.nextInt(size);
        int castleY = 0;


        board[castleY][castleX] = castle;


        System.out.println("Привет! Начнем игру? (Напиши: ДА или НЕТ)");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        System.out.println("Ваш ответ: " + answer);


        switch (answer) {
            case "ДА": {

                System.out.println("Выбери уровень игры(от 1 до 5):");
                int difficultGame = scanner.nextInt();
                if (difficultGame <= 5 && difficultGame >= 1) {
                    System.out.println("Уровень игры: " + difficultGame);
                }
                else {
                    System.out.println("Такого уровня нет!");
                }
                while (true) {
                  board[personY - 1][personX - 1] = person;
                    System.out.println("");
                    for (int y = 0; y < size; y++) {
                        System.out.println(wall);
                        for (int x = 0; x < size; x++) {
                            if (personY - 1 == y && personX - 1 == x){
                                System.out.print(leftBlock + person + " ");
                            }
                            else {
                                System.out.print(leftBlock + "   ");
                            }
                            System.out.print(leftBlock + board[y][x] + " ");
                        }
                        System.out.println(rightBlock);
                    }
                    System.out.println(wall);

                    for (String[] raw : board) {
                        System.out.println(wall);
                        for (String col : raw) {
                            System.out.print(leftBlock + col + " ");
                        }
                        System.out.println(rightBlock);
                    }
                    System.out.println(wall);


                    System.out.println("Количество жизней: " + personLive);
                    System.out.println("Ваш ход: ");
                    System.out.println("Координаты персонажа - x: " + personX + ", y: " + personY);
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    System.out.println(x + ", " + y);

                    if (x != personX && y != personY) {
                        System.out.println("Такой ход не возможен!");
                    }
                    else
                        if (Math.abs(x - personX) == 1 || Math.abs(y - personY) == 1) {
                            if (board[y - 1][x - 1].equals("  ")) {
                                board[personY - 1][personX - 1] = "  ";
                                personX = x;
                                personY = y;
                                step++;
                                System.out.println("Новые координаты: " + personX + ", " + personY);
                                System.out.println("Номер хода: " + step);
                            }
                            else
                                if (board[y - 1][x - 1].equals(castle)) {
                                System.out.println("Вы прошли игру!");
                                break;
                            }
                                else {
                                System.out.println("Решите задачу.");

                            }
                    }
                        else {
                        System.out.println("Координаты не изменились");
                    }

                    if (personLive <= 0) {
                        break;
                    }
                }

                System.out.println("Жизни закончились. Ваш результат: ");
            }
            case "НЕТ":
                System.out.println("Сыграем позже");
            default:
                System.out.println("Некорректный ввод");
        }

    }
}