
package section_three;
import java.util.Scanner;
import java.util.Locale;
public class fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("F: ");
        double temp = scanner.nextDouble();
        celsius(temp);
    }
    public static void celsius(double temp) {
        System.out.println("C: " + (temp-32)*5/9 + " Celsius degrees");
    }
}
