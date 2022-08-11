package section_three;
import java.util.Scanner;
import java.util.Locale;

public class doc_Comments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Lenght: ");
        double length = scanner.nextDouble();
        System.out.println("Width:");
        double width = scanner.nextDouble();
        System.out.println("The area of a rectangle with length of " + length + " and width of " + width + " is equal to " + calculateArea(length, width));
    }
    /**
     * 
     * The function name: calculateArea
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. calculates the area of a rectangle and returns it
     * 
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    } 
}
