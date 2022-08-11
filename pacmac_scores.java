package section_six;
import java.util.Scanner;
import java.util.Locale;
public class pacmac_scores {
    public static void main(String[] args) {

        int[] pacmac_scores = {randNum(),randNum(),randNum(),randNum(),randNum(),randNum(),randNum(),randNum(),randNum(),randNum()};
        for(int i = 0; i < pacmac_scores.length; i++) {
            System.out.print(pacmac_scores[i] + "  ");
        }
        int temp = 0;
        int seatNo =0;

        for(int i = 0; i < pacmac_scores.length; i++) {
            if(temp < pacmac_scores[i]) {
                temp = pacmac_scores[i];
                seatNo = i;

            } 
        }
        System.out.println("\nthe highest score is : " + temp);
        System.out.println("this belongs to the Gent from the seat no. " + seatNo);
    }
    /**
    * Function name: randNum
    * 
    * return an intiger
    * 
    * Inside the function:
    * 1.Yields a random number range 0 - 50000
    * 
    */
    public static int randNum() {
        double rand = Math.random() * 50000;
        rand = rand++;
        int randNumber = (int) rand;
        return randNumber;
    }
}
/*
 * ranges
 * 0.0001 - 0.9999
 * 0.0001 - 49.9999
 * 0.0001 - 50.9999
 */