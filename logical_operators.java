
package section_three;
import java.util.Scanner;
import java.util.Locale;
public class logical_operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("your credit:");
        int yourCredit = scanner.nextInt();
        System.out.println("your GPA:");
        double yourGPA = scanner.nextDouble();
        if(yourCredit >= 40 || yourGPA >= 2.0) {
            System.out.println("Congrats! You passed!");
        } else {
            System.out.println("Sorry! You'll have to work hard!");
        }
    }
    
}
