package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/8/15.
 */
import java.util.Scanner;

public class Whilee {
    public static void main(String[] argv) {
        int x = 10;
        Scanner scanner = new Scanner(System.in);
        while (x < 100) {
            System.out.println("the number is " + x);
            System.out.println("What's another number?");

            x = scanner.nextInt();
        }
    }
}
