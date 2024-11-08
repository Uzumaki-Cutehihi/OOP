import java.util.Scanner;

public class SumOfSines {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double t = in.nextDouble();
        double radiant = Math.toRadians(t);
        double sum = Math.sin(radiant*2) + Math.cos(radiant*3);
        System.out.println(sum);
    }
}
