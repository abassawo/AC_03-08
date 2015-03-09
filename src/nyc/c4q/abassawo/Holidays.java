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
        System.out.print("What month is it? ");

        month = input.next();

        System.out.print("What day of the month is it? ");
        day = input.nextInt();

        if ( month .equalsIgnoreCase("January")
            && day ==1)
             holiday = "New Years Day";
        else if (month .equalsIgnoreCase("May")
            && day ==5)
            holiday = "Cinco de Mayo";
        else if (month .equalsIgnoreCase("July")
               && day == 4)
            holiday = "Independence Day";
        else if (month .equalsIgnoreCase("December")) {
            if (day == 25)
                holiday = "Christmas";
                else if (day == 31)
                holiday = "New Years eve";
                else
                holiday = "the holiday season";
        }
        else if (month .equalsIgnoreCase("March")
                && day ==8)
            holiday = "International Women's Day..and Abass' Bday";
        else { //nb: braces necessary here
            System.out.println("Today is " + month + " " + day + " It is not a holiday");
            return;
        }
        System.out.println("Today is " + month + " " + day + "," + " Happy " + holiday);
    }
}
