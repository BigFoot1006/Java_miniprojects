package section_four;
import java.util.Scanner;
import java.util.Locale;

public class areaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Please choose what do you want:");
        System.out.println("1 - triangle area\n2-square area\n3 - circle area\n4 - rectangle area");
        int option = scanner.nextInt();
        switch (option) {
            case 1: {
                System.out.println("Triangle height:");
                double height = scanner.nextDouble();
                System.out.println("Triangle base:");
                double base = scanner.nextDouble();
                System.out.println("Tirangle area:" + areaTriangle(height, base));
                break;
            }
            case 2: {
                System.out.println("Square base:");
                double base = scanner.nextDouble();
                System.out.println("Square area:" + areaSquare(base));
                break;
            }
            case 3: {
                System.out.println("Circle radius:");
                double radius = scanner.nextDouble();
                System.out.println("Circle area:" + areaCircle(radius));
                break;
            }
            case 4: {
                System.out.println("Rectangle length:");
                double length = scanner.nextDouble();
                System.out.println("Rectangle width:");
                double width = scanner.nextDouble();
                System.out.println("Rectangle area:" + areaRectangle(length, width));
                break;
            }
            default: {
                System.out.println("Wrong values");
            }
            }
        scanner.close();
    }
    /**
     * function name: areaTriangle
     * @param height (double)
     * @param base (double)
     * 
     * Inside the function
     * 1.calculate the area of a triangle
     * 2. if one of the value is below the zero, return error message 
     * 
     */
    public static double areaTriangle(double height, double base) {
        if(height < 0 || base < 0) {
            System.out.println("Error, the values are not possible");
            System.exit(0);
            return 0;
        } else {
            return (height*base)/2;
        }
    }
    /**
     * function name: areaSquare
     * @param base (double)
     * 
     * Inside the function
     * 1.calculate the area of a square
     * 2. if base value is below the zero, return error message 
     * 
     */
    public static double areaSquare(double base) {
        if(base < 0) {
            System.out.println("Error, the values are not possible");
            System.exit(0);
            return 0;
        } else {
            return base * base;
        }
    }
    /** function name: areaCircle
    * @param radius (double)
    * 
    * Inside the function
    * 1.calculate the area of a circle
    * 2. if radius value is below the zero, return error message 
    * 
    */
   public static double areaCircle(double radius) {
       if(radius < 0) {
           System.out.println("Error, the values are not possible");
           System.exit(0);
           return 0;
       } else {
           return radius * radius * Math.PI;
       }
   }
   /**
     * function name: areaRectangle
     * @param length (double)
     * @param width (double)
     * 
     * Inside the function
     * 1.calculate the area of a rectangle
     * 2. if one of the value is below the zero, return error message 
     * 
     */
    public static double areaRectangle(double length, double width) {
        if(length < 0 || width < 0) {
            System.out.println("Error, the values are not possible");
            System.exit(0);
            return 0;
        } else {
            return (length * width);
        }
    }
}