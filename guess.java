package section_five;
import java.util.Scanner;
import java.util.Locale;
public class guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Insert a number intiger from 1 to 5:");
        int yourNumber = scanner.nextInt();
        int secretNumber = 1;
        if(yourNumber == secretNumber) {
            System.out.println("You guessed! Congrats!");
        } else {
            while(yourNumber != secretNumber) {
                System.out.println("Try again");
                yourNumber = scanner.nextInt();
            }
            System.out.println("You guessed! Congrats!");
            scanner.close();
        }  
    }
}
