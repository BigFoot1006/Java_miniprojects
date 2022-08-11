package section_five;
import java.util.Scanner;
import java.util.Locale;

public class while_password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        String username = "Samantha";
        String password = "Python<3";
        System.out.println("Your name: ");
        String yourName = scanner.nextLine();
        System.out.println("your password: ");
        String yourPass = scanner.nextLine();
        while (!yourName.equals(username) || !yourPass.equals(password)) {
            System.out.println("Your name: ");
            yourName = scanner.nextLine();
            System.out.println("your password: ");
            yourPass = scanner.nextLine();
        }
        System.out.println("Congrats! You did it!");
        scanner.close();
    }
}
