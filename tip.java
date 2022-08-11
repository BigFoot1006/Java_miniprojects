package section_three;
import java.util.Scanner;
import java.util.Locale;
public class tip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Please tell us what is the note value?");
        double price = scanner.nextDouble();
        tip_waiter(price);
    }
    public static void tip_waiter(double price) {
        System.out.println("The tip for your waiter is " + price*0.85 + " dollars");
    }
}
