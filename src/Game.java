import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
//

        int personX = 0;
        int personY = 0;
        int step = 0;
        int personLive = 3;
        int size = 5;
        int counter = 1;
        String person = "Г";
        String monster = "Мм";
        String gamingField = "+ —— + —— + —— + —— + —— +\n" +
                "|    |    |    |    |    |\n" +
                "+ —— + —— + —— + —— + —— +\n" +
                "|    |    |    |    |    |\n" +
                "+ —— + —— + —— + —— + —— +\n" +
                "|    |    |    |    |    |\n" +
                "+ —— + —— + —— + —— + —— +\n" +
                "|    |    |    |    |    |\n" +
                "+ —— + —— + —— + —— + —— +\n" +
                "|    |    |    |    |    |\n" +
                "+ —— + —— + —— + —— + —— +";
        String leftBlock = " | ";
        String rightBlock = " |";
        String wall = " + —— + —— + —— + —— + —— + ";
        String castle = "\\uD83C\\uDFF0";
        int castleY = 1;
        Random random = new Random();
        int castleX = 1 + random.nextInt(size);

//
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
                        System.out.println("Координаты не поменялись");
                    } else {
                        if (Math.abs(x - personX) == 1 || Math.abs(y - personY) == 1) {
                            personX = x;
                            personY = y;
                            step += 1;
                            System.out.println("Новые координаты: " + personX + ", " + personY);
                            System.out.println("Номер хода: " + step);
                        } else {
                            System.out.println("Такой ход невозможен");
                        }
                    }
                } else {
                    System.out.println("Такого уровня нет!");
                }
                break;
            case "НЕТ":
                System.out.println("Сыграем позже");
                break;
            default:
                System.out.println("Некорректный ввод");
        }
        while ((personLive > 0) && !(personX == castleX && personY == castleY)) {
        }
        //while (true) {
        //    // … логика игры
        //    if (personLive <= 0) {
        //        break;
        //    }
        //}
        //System.out.println("Жизни закончились. Ваш результат: ");

        // while (counter <= size) {
        //
         // counter ++;
    //}
        for (int counterY = 1; counterY < size; counterY += 1) {
            //
        }
        for (int y = 1; y <= size; y++) {
            System.out.println(wall);
            for (int x = 1; x <= size; x++) {
            System.out.println(leftBlock);
                if (personY == y && personX == x) {
                 System.out.println(person);
              } else if (castleX == x && castleY == y) {
                 System.out.println(castle);
              } else {
        	        System.out.println("    ");
              }
            }
          System.out.println(rightBlock);
        }
        System.out.println(wall);
    }
}