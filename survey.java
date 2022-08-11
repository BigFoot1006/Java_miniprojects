package section_two;
import java.util.Scanner;
import java.util.Locale;

public class survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int count =0;

        System.out.println ("What's your name?");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);
        count++;

        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        System.out.println("Your age is " + age);
        count++;
        
        System.out.println("\nWhat is the coffe price?");
        double coffeePrice = scan.nextDouble();
        System.out.println("The coffe price is " + coffeePrice);
        count++;
        
        System.out.println("\nThank you " + name + " for answering all " + count + " questions!");
        scan.close();
    }
}
