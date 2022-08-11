package section_four;
import java.util.Scanner;
import java.util.Locale;

public class dice_jack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Choose three numbers from 1 to 6");
        System.out.println("First:");
        int yourChoice1 = scanner.nextInt();
        System.out.println("Second:");
        int yourChoice2 = scanner.nextInt();
        System.out.println("Third:");
        int yourChoice3 = scanner.nextInt();
        scanner.close();
        int yourCoice = yourChoice1 + yourChoice2 + yourChoice3; 
        if(yourChoice1 < 1 || yourChoice2 < 1 || yourChoice3 < 1) {
            System.out.println("Numbers outside the range");
            System.exit(0);
        }
        if(yourChoice1 > 6 || yourChoice2 > 6 || yourChoice3 > 6) {
            System.out.println("Numbers outside the range");
            System.exit(0);
        }
        System.out.println("your chice is " + yourCoice);

        int nr1 = rollTheDice();
        int nr2 = rollTheDice();
        int nr3 = rollTheDice();
        int sum = nr1 + nr2 + nr3;
        System.out.println("dices are " + nr1 + " " + nr2 + " " + nr3 + " that means a sum of " + sum);
        if (yourCoice < sum && sum - yourCoice < 3) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
    /**
     * function rollTheDice 
     * 
     * Inside the function
     * 1. roll three dices
     * 2. sum all the dices
     * 
     */
    public static int rollTheDice() {
       double randomNumber;
        randomNumber = Math.random() * 6;
        int randomInt = (int)randomNumber;
        randomInt++;
        return randomInt;
    }
}
