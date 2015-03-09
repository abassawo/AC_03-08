package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/8/15.
 */
public class Counter {
    public static void main(String[] args) {
        /*Counts down from 10 by 1
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i -= 1; // i = i + 1 is the same
        }
        *////////

        //Counts down from 10 by 5 and then once it reaches 10, it counts by 1 until it reaches 0.
        int i = 100;
        while (i >= 1) {
            System.out.println(i);
            if (i > 10)
                i -= 5;
            else
                i -= 1;
        }
        System.out.println("Blastoff!");
    }
}
