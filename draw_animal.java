package section_three;
import java.util.Scanner;
import java.util.Locale;
public class draw_animal {
    public static void main(String[] args) {
        System.out.println("Choose an option for your animal to be drawn:");
        System.out.println("1 - butterfly\t2 - elephant\t3 - bear\t4 - snake");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int option = scanner.nextInt();
        draw(option);
    }
    /**
     * 
     * function name: draw
     * @param option
     * 
     * Inside the function: based on the choise, draw one of the following:
     * 1.butterfly
     * 2.elephant
     * 3.bear
     * 4.snake
     * 
     */
    public static void draw(int option) {
        switch(option) {
            case 1: {
                System.out.println("Draw a butterfly");
                break;
            }
            case 2: {
                System.out.println("Draw an elephant");
                break;
            }
            case 3: {
                System.out.println("Draw a bear");
                break;
            }
            case 4: {
                System.out.println("Draw a snake");
                break;
            } 
        }
    }
}
