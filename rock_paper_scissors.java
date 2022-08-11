package section_four;
import java.util.Scanner;
import java.util.Locale;

public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are");
        String respond = scanner.nextLine();
        if(respond.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock -- paper -- scissors, shoot!");
            System.out.println("Choose your option: \n1 - rock\t2 - paper\t3 - scissors");
            int yourChoise = scanner.nextInt();
            if (computerChoise() == yourChoise) {
                System.out.println("You win! Congrats");
            } else {
                System.out.println("Sorry! You lost! Try some other time!");
            }
            String yourOption = "";
            String computerOption = "";
            switch (yourChoise) {
                case 1: yourOption = "rock"; break;
                case 2: yourOption = "paper"; break;
                case 3: yourOption = "scissors"; break;
                default: System.out.println("Your choise is not valid! Try some other time!");
            }
            switch (computerChoise()) {
                case 1: computerOption = "rock"; break;
                case 2: computerOption = "paper"; break;
                case 3: computerOption = "scissors"; break;
                default: System.out.println(" The computer yields a glitch!");
            }
            System.out.println("Your choise was: " + yourChoise + " = " + yourOption);
            System.out.println("The computer choise was: " + computerChoise() + " = " + computerOption);
        } else {
            System.out.println("Darn, some other time...!");
        }
        scanner.close();
    }
    /**
     * function name: computerChoise
     * 
     * Inside the function: 
     * 1. Yields a random number from 1 to 3
     * 2. return this number
     * 
     * @return
     */
    public static int computerChoise() {
        int choise = (int) Math.random()*3;
        return choise +1;
    }
}