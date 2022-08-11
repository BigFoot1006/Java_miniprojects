package section_three;
import java.util.Scanner;
import java.util.Locale;
public class trivia_quiz {
    public static void main(String[] args) {
        System.out.println("\nWELCOME TO OUR TRIVIA CONTEST");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int score=0;
        System.out.println("for each question, please select one of the following options: a, b, c or d.");
        
        System.out.println("\nFirst question:");
        
        System.out.println("\n1. Which country held the 2016 Summer Olympics?");
        System.out.println("a - China\tb - Ireland\tc - Brasil\td - Italy");
        
        String country = scanner.nextLine();
        switch (country) {
            case "a": { 
                score+=5;
                break;
            }
            case "b": { 
                break;
            }
            case "c": { 
               score+=2;
               break;
            }
            case "d": { 
                score++;
                break;
            }
        }
        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("a - Venus\tb - Saturn\tc - Mercury\td - Mars");
        String planet = scanner.nextLine();
        switch (planet) {
            case "a": {
                score+=2; 
                break;
            }
            case "b": { 
                break;
            }
            case "c": { 
               score+=5;
               break;
            }
            case "d": { 
                score++;
                break;
            }
        }
        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("a - 0\tb - A\tc - B\td - AB Negative");
        String blood = scanner.nextLine();
        switch (blood) {
            case "a": { 
                break;
            }
            case "b": { 
                score++;
                break;
            }
            case "c": { 
                score+=2;
                break;
            }
            case "d": { 
                score+=5;
                break;
            }
        }

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("a - Ron Weasley\tb - Hermione Granger\tc - Draco Malfoy");
        String character = scanner.nextLine();
        switch (character) {
            case "a": { 
                score+=5;
                break;
            }
            case "b": { 
                score+=2;
                break;
            }
            case "c": {
                score++; 
                break;
            }
        }
        System.out.println("\n5. What is the biggest ocean?");
        System.out.println("a - Atlantic\tb - Pacific\tc - Arctic\td - Indian");
        String ocean = scanner.nextLine();
        switch (ocean) {
            case "a": { 
                score+=2;
                break;
            }
            case "b": { 
                score+=5;
                break;
            }
            case "c": { 
                break;
            }
            case "d": { 
                score++;
                break;
            }
        }
        System.out.println("\nYour final score is " + score + " points");
        if(score ==25) {
            System.out.println("Congrats! You have a thorough general knowledge!\n");
        }
        else if(score>=10) {
            System.out.println("You have some general knowledge! Keep practicing!\n");
        }
        else {
            System.out.println("Sorry! You didn't pass! You'll have to practice!\n");
        }
    }
}
