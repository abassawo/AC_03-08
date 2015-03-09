package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/8/15.
 */
import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess = 44;

        Random random = new Random();
        int number = random.nextInt(10) + 1;

        boolean Win;
        if (guess != number); {
            Win = false;
        }

        while (guess != number) {
            System.out.print("I have chosen a number between 1 and 10. Try to guess it ");
            guess = input.nextInt();
            if (guess > number && guess < 10){
                System.out.print("Sorry, too high. Why don't you try again?"); //almost
            }
            else if (guess < number) {
                System.out.print("Sorry too low. Try again!");   //close but no cigar
            }
            System.out.println("Your guess: " + guess);

            if (guess == number) {    //success
                System.out.println("You guessed it!");
                break;
            }
            else if (guess > 10 || guess < 1)  //guess failed
                System.out.print("That is not a possible guess.  ");
        }

    }

}
