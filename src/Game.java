import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int size = 5;
        int personX = 0;
        int personY = 0;
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
    }
}