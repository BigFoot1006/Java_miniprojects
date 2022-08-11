package section_two;
import java.util.Scanner;
import java.util.Locale;

public class javagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Welcome to Javagram! Let's sign you up.");

        System.out.println("What's your first name?");
        String firstName = scan.nextLine();

        System.out.println("What's your last name?");
        String lastName = scan.nextLine();

        System.out.println("What's your age?");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("What's your username?");
        String userName = scan.nextLine();

        System.out.println("What's your city?");
        String city = scan.nextLine();

        System.out.println("What's your country?");
        String country = scan.nextLine();

        System.out.println("\nHere are the information you entered: ");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Username: " + userName);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        scan.close();
    }
    
}
