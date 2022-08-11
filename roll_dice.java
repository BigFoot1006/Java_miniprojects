package section_five;
import java.util.Scanner;
import java.util.Locale;

public class roll_dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Please press 1 to start rolling the dices");
        int input = scanner.nextInt();
       while (input != 1) {
            System.out.println("you insert wrong number");
            System.out.println("Try again!");
            input = scanner.nextInt();
        } 
        int dice1 = 0; 
        int dice2 = 1; 
        while(dice1 != dice2) {
        dice1 = rollOneDice();
        dice2 = rollOneDice();
        System.out.println("Dice #1 =  " + dice1 + "\t Dice #2 = " + dice2); 
    }
    }
    /**
     * Function name: rollOneDice 
     * @return dice1 (int)
     * Inside the function:
     * 1. Yields random number int range 1-6
     * 
     */
    public static int rollOneDice() {
        int dice = (int) (Math.random() * 6);
        return dice +1;
    }
}

/* (0.0001 - 5.9999)  + 1 
output (1.0001 - 6.9999) */