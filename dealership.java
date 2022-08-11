package section_three;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

import java.util.Locale;
public class dealership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("please choose one of the following conditions: \n - a for buying a car \n - b for selling a car");
        String option = scanner.nextLine();
        switch (option) {
            case "a": {
                System.out.println("You chose to buy a new car from us");
                System.out.println("What is your budget?");
                int budget = scanner.nextInt();
                if(budget>10000) {
                    System.out.println("Congrats! We have a Toyota Corolla for you at just $10000");
                } else {
                    System.out.println("Sorry! Your budget is under our selling prices");
                }
                break;
            }
            case "b": {
                System.out.println("You choose to sell us your car");
                System.out.println("What is your price request?");
                int price = scanner.nextInt();
                if(price > 10000) {
                    System.out.println("Sorry! your price is too big for our offer");
                } else {
                    System.out.println("We bought it! Nice doing business with you!");
                }
                break;
            }
            default: {
                System.out.println("Your option is not valid");
            }
        }
    }
}
