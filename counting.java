package section_five;
import java.util.Scanner;
import java.util.Locale;

public class counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Hi Timmy! Choose a number to count to: ");
        int yourNumber = scanner.nextInt();
        for(int i = 0; i<= yourNumber; i++) {
            System.out.print( " " + i);
        }
        scanner.close();
    }
    
}
