package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/8/15.
 */
public class TruthTable {
    public static void main(String[] args) {
        System.out.println("true && true = " + (true && true)); //true trues
        System.out.println("true && false = " + (true && false)); //true and false (viceversa) yield false.
        System.out.println("false && true = " + (false && true));  //^
        System.out.println("false && false = " + (false && false)); //false and false yields false

        System.out.println("\ntrue || true = " + (true || true));  //true
        System.out.println("true || false = " + (true || false));  // ^
        System.out.println("false || true = " + (false || true));   //^
        System.out.println("false || false = " + (false || false));   // false or false yields false.

        /* EXCLUSEIVE OR also known as XOR //You have to still choose one. one must be true, not both, but not neither.*/

        System.out.println("\ntrue ^ true = " + (true ^ true));  //true
        System.out.println("true ^ false = " + (true ^ false));
        System.out.println("false ^ true = " + (false ^ true));
        System.out.println("false ^ false = " + (false ^ false));   // false
    }
}
