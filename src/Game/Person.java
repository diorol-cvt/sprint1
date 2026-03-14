package Game;

import java.util.Random;

public class Person {
    private int x, y;
    static int live = 3;
    private String image = "\uD83E\uDDD9\u200D";
    Random random = new Random();
    Person(int sizeboard) {
        int n = random.nextInt(sizeboard);
        y = sizeboard;
        x = n == 0 ? 1 : n;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean moveCorrect(int x, int y) {
        return this.x == x && Math.abs(this.y - y) == 1 || this.y == y && Math.abs(this.x - x) == 1;
    }
    public void downLive() {
        live -= 1;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public String getImage() {
        return image;
    }
    public int getLive() {
        return live;
    }
    public void setImage(String image) {
        this.image = image;
    }
}
