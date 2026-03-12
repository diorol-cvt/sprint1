import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        int step = 0;
        int sizeboard = 5;
        int castleY = 0;
        Random random = new Random();
        int castleX = random.nextInt(sizeboard);
        String castle = "\uD83C\uDFF0";
        Person person = new Person(sizeboard);
        String[][] board = new String[sizeboard][sizeboard];
        for (int y = 0; y < sizeboard; y++) {
            for (int x = 0; x < sizeboard; x++) {
                board[y][x] = "  ";
            }
        }
        int countMonster = sizeboard * (sizeboard - 1) - 1;
        Monster[] arrMonster = new Monster[countMonster + 1];
        int count = 0;
        Monster test;
        while (count <= countMonster) {
                int k = random.nextInt(2);
                if (k == 0) {
                        test = new Monster(sizeboard);
                    }else {
                        test = new BigMonster(sizeboard);
                    }
                if (board[test.getY()][test.getX()].equals("  ")) {
                        board[test.getY()][test.getX()] = test.getImage();
                        arrMonster[count] = test;
                        count++;
                    }
            }
        board[castleY][castleX] = castle;
        System.out.println("Привет! Начнем игру? (Напиши ДА или НЕТ)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        System.out.println("Ваш ответ: " + answer);
        switch (answer) {
            case "ДА":
            System.out.println("Вперед к победе!");
            System.out.println("Выбери уровень сложности игры(от 1 до 5):");
            int difficultGame = scanner.nextInt();
            while (true) {
                if (difficultGame <= 5 && difficultGame >= 1) {
                        board[person.getY() - 1][person.getX() - 1] = person.getImage();
                        outputboard(board);
                        System.out.println("Количество жизней: " + person.getLive());
                        System.out.println("Координаты персонажа: X = " + person.getX() + ", Y = " + person.getY());
                        System.out.println("Введи новые координаты через пробел(Например: 1 2).");
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        if (person.moveCorrect(x, y)) {
                            String next = board[y - 1][x - 1];
                            if (next.equals("  ")) {
                                board[person.getY() - 1][person.getX() - 1] = "  ";
                                step++;
                                person.move(x, y);
                                System.out.println("Номер хода: " + step + "\nКоординаты персонажа: " + person.getX() + ", " + person.getY());
                            } else if (next.equals(castle)) {
                                System.out.println("Вы прошли игру!");
                                break;
                            } else {
                                for (Monster m : arrMonster) {
                                    if (m.conflict(x, y)) {
                                        if (m.taskMonster(difficultGame)) {
                                            board[person.getY() - 1][person.getX() - 1] = "  ";
                                            person.move(x, y);
                                        }
                                        else {
                                            person.downLive();
                                            board[person.getY() - 1][person.getX() - 1] = "  ";
                                            person.move(x, y);
                                            if (person.getLive() == 0) {
                                                System.out.println("Жизни закончились. Конец игры.");
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        else{
                            System.out.println("Такой ход невозможен.");
                        }
                    }
                    else {
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
    static void outputboard(String[][]board){
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