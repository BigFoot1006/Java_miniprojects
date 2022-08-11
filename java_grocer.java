package section_six;
import java.util.Scanner;import java.util.Locale;

public class java_grocer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        for(int i = 0; i < aisles.length; i++) {
            System.out.print(aisles[i] + "  ");
        }
        System.out.println("\nWhat do you want?");
        String option = scanner.nextLine();
        for(int i = 0; i < aisles.length; i++)  {
            if(aisles[i].equals(option)) {
                System.out.println("The coffee is in the aisles no." + i);
            }
        }
    }
}
