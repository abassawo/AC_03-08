package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/8/15.
 */
import java.util.Scanner;
public class not {
    public static void main(String[] args) {
        int x = 10;

        /*System.out.println(x != 10);
         //same statement as below.
        System.out.println(x != 10);
*/      String fruit;
        Scanner input = new Scanner(System.in);
        System.out.println("tell me a fruit;");
        fruit = input.next();

      while (! fruit.equalsIgnoreCase("orange")) {
            System.err.print("Please enter another fruit");
        }
    }
}
