import com.sun.source.util.SourcePositions;

import java.net.SocketOption;

public class lesson4 {
    public static void main(String[] args) throws InterruptedException {
        int x = 6;
        while (x < 10) {
            System.out.println(x++);
         //   Thread.sleep(500);
        }

        x = 4;
        do {
            System.out.println("True");
        } while (x > 5);



        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        int pX, pY;
        int cX, cY;
        int mX1, mY1, mX2, mY2;

        int[] array = new int[9];
        System.out.println(array[8]);


        String monsters[] = new String[10];
        monsters[5] = "Мм";
        monsters[6] = "Мм";
        monsters[7] = "Мм";



        for (int i = 0; i < monsters.length; i++) {
            System.out.println(monsters[i]);
        }

    }
}
