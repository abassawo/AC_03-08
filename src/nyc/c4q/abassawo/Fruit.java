package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/8/15.
 */
import java.util.Scanner;
public class Fruit {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What fruit?");
        String color, flavor;
        String fruit = input.next();

        if (fruit.equals("banana")) {
            color = "yellow";
            flavor = "sweet";
        } else if (fruit.equals("grapefruit")) {
            color = "pink";
            flavor = "bitter";
        } else if (fruit.equals("lemon")) {
            color = "yellow";
            flavor = "sour";
        } else if (fruit.equals("watermelon")) {
            color = "green";
            flavor = "mouthwatering";
        } else if (fruit.equals("orange")) {
            color = "orangeish";
            flavor = "tangy";
            System.out.println("An organge is "  + color + " and " + flavor);
            return;
        }
        else {
            fruit = "n/a";
            System.out.println("I don't know that one.");
            return;
        }
        System.out.println("A " + fruit + " is " + color + " and " + flavor);
    }
}
