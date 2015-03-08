package nyc.c4q.abassawo;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scans = new Scanner(System.in);
        String smiley = scans.next();

        String emotion;
        if (smiley.equals(":"))
            emotion = "happy";
        else if (smiley.equals(":("))
            emotion = "sad";
        else if (smiley.equals(":|"))
            emotion = "plain";

        System.out.println("What's your score?");
        int score = scans.nextInt();

        if (score > 100)
            System.out.println("Perfect Score!");
        else if (score >= 90)
            System.out.println("Great");

    }
}
