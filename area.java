package section_four;
import java.util.Scanner;
import java.util.Locale;
public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Base = ");
        double base = scanner.nextDouble();
        System.out.println("Height =");
        double height = scanner.nextDouble();
        scanner.close();
        double ar = area(height, base);
        System.out.println("Area = " + ar);
    }
    public static double area(double height, double base) {
        return height*base/2;
    }
}
