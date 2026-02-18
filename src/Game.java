import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int personX = 0;
        int personY = 0;
        int step = 0;
        int personLive = 3;
        int board = 5;
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
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        boolean flag = answer.equals("ДА");
        switch (answer) {
            case "ДА":
                System.out.println("Начнем игру");
                System.out.println("Выбери уровень сложности игры(от 1 до 5):");
                int difficultGame = scanner.nextInt();
                if (difficultGame >= 1 & difficultGame <= 5) {
                    System.out.println("Уровень сложности: " + difficultGame);
                    System.out.println("Начальные координаты: 0, 0");
                    System.out.println("Твой ход:");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    if ((x == personX && y == personY) & (x >= 0 & x <= 5) & (y >= 0 & y <= 5)) {
                        System.out.println("Такой ход невозможен");
                    }
                    else {
                        if (Math.abs(x - personX) == 1 || Math.abs(y - personY) == 1) {
                            personX = x;
                            personY = y;
                            step += 1;
                            System.out.println("Новые координаты: " + personX + ", " + personY);
                            System.out.println("Номер хода: " + step);
                        }
                        else {
                            System.out.println("Координаты не поменялись");
                        }
                    }
                }
                else {
                    System.out.println("Такого уровня нет!");
                }
                break;
            case "НЕТ":
                System.out.println("Сыграем позже");
                break;
            default:
                System.out.println("Некорректный ввод");
        }
    }
}