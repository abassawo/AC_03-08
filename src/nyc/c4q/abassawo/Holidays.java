package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/8/15.
 */
import java.util.Scanner;
public class Holidays {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        String holiday = null;
        int day = 0;
        String month;
        System.out.print("What month is it?");

        month = input.next();

        System.out.println("What day of the month is it?");
        day = input.nextInt();

        if (day == 1 && month .equalsIgnoreCase("January"))
            holiday = "New Years Day";
        else if (day == 5 && month .equalsIgnoreCase("May"))
            holiday = "Cinco de Mayo";
        else if (day == 4 && month .equalsIgnoreCase("July"))
            holiday = "Independence Day";
        else if (day == 25 && month .equalsIgnoreCase("December"))
            holiday = "Christmas";
        else if (day == 8 && month .equalsIgnoreCase("March"))
            holiday = "International Women's Day..and Abass' Bday";
        else {
            System.out.println("Today is " + month + " " + day);
            return;
        }
        System.out.println("Today is " + month + " " + day + "," + " Happy " + holiday);
    }
}
