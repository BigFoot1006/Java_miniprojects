package section_six;
import java.util.Scanner;
import java.util.Locale;

public class pizza_delivery {
    public static void main (String[] args) {
        System.out.println("How many pizza toppings do you want?");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int numberOfToppings = scanner.nextInt();
        System.out.println("Great! Enter each topping you want!");
        String str = scanner.nextLine();
        String[] yourToppings = new String[numberOfToppings];

        for (int i=0; i < numberOfToppings; i++) {
            yourToppings[i] = scanner.nextLine();
        }
        System.out.println("\nThank you! Here are the toppings your ordered:");
        for(int i = 0; i < numberOfToppings; i++) {
            System.out.println(i + ". " + yourToppings[i]);
        }
    }
}
