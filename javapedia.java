package section_six;
import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class javapedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("How many figures do you want to store?");
        int numberOfFigures = scanner.nextInt();

        String[][] figures = new String[numberOfFigures][3];
        String str = scanner.nextLine();

        for(int i = 0; i < numberOfFigures; i++) {
            System.out.println("Please insert the name of your historical figure:");
            figures[i][0] = scanner.nextLine();
            System.out.println("Please insert the brith date: in format dd/mm/yyyy: ");
            figures[i][1] = scanner.nextLine();
            System.out.println("Please insert the occupation: ");
            figures[i][2] = scanner.nextLine(); 
            System.out.println("\n");
        }
        print2Darray(figures);
    }
    /**
     * function name print2Darray
     * @return (void)
     * @param string
     * Inside the funtion:
     * 1. print an array (String)
     * 
     */
    public static void print2Darray (String[][] string) {
        
        for (int i = 0; i < string.length; i++) {
            for(int j = 0; j < string[i].length; j++) {
                System.out.print( string[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
