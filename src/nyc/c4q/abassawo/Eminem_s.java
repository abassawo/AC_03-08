package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/8/15.
 */
import java.util.Scanner;
public class Eminem_s {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int mCount, mTotal, mEaten;
        mTotal= 100;
        mEaten = 0;
        //System.out.println("How many M&M's do you want? ");
           //current count
        /*mEaten = input.nextInt();*/
        while (mTotal > 0) {
            System.out.print("You have " + mTotal + " m&m's left. How many would you like? ");
                //user output
            mEaten = input.nextInt();
            if (mEaten > mTotal) {
                mEaten = 0;
                System.out.println("Sorry, not enough m&m's left. How many m&m's would you like?");
            }
            mTotal = mTotal - mEaten;
        }
        /*while (mEaten >= 100 || mEaten > mTotal) {
            mEaten = input.nextInt();
            System.out.println("Sorry, not enough m&m's left. How many m&m's would you like?");

        }
        System.out.println("You have " + mTotal + "left. how many would you like now?");
        */
        System.out.println("You're cut off");
    }
}
