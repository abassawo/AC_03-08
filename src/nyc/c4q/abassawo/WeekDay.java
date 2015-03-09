package nyc.c4q.abassawo;
/**
 * Created by c4q-Abass on 3/8/15.
 */
import java.util.Scanner;
public class WeekDay {
    public static void main (String[] args) {
        Scanner dayInput = new Scanner(System.in);
        String dayofWeek;
        System.out.println("What day of the week it is?");
        dayofWeek = dayInput.nextLine();

        if (dayofWeek .equalsIgnoreCase("Saturday") || dayofWeek .equalsIgnoreCase("Sunday"))
            System.out.println("It is a wekeend.");
           //it must be a Weekday
        else if (dayofWeek .equalsIgnoreCase("Monday")
                || dayofWeek .equalsIgnoreCase("Tuesday")
                || dayofWeek .equalsIgnoreCase("Wednesday")
                || dayofWeek .equalsIgnoreCase("Thursday")
                || dayofWeek .equalsIgnoreCase("Friday"))
            System.out.println("It is a weekday.");

        else {      //notreal
            System.err.println("That's not a real day.");
            return;
        }
    }
}

