public class Homework {
    public static void main(String[] args) {
        System.out.println("Hello world");
        double R = 5.0; // инициализация в коде
        double V = (4.0 / 3.0) * Math.PI * Math.pow(R, 3);
        System.out.println(V);
        double x = 2.0;
        double y = 3.0;
        double denominator = y + 1.0 / (x * x - 4.0);
        double fraction = (x + y) / denominator;
        double result = (1.0 + y) * (2.0 * x + y * y - fraction);
        System.out.println(result);
        double q = 1.0;
        double w = 2.0;
        double e = 3.0;
        double res = ((q + 2.0) * w - e) / w + w * e;
        System.out.println(res);

    }
}
