package section_three;
import java.util.Scanner;
import java.util.Locale;
public class weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("outdoor temperature:");
        int outTemp = scanner.nextInt();
        if(outTemp>-15 && outTemp < -1) {
            System.out.println("The forecast is FREEZING! Stay home!");
        } else if (outTemp > 0 && outTemp < 10) { 
            System.out.println("The forecast is Chilly. Wear a coat!");
        } else {
            System.out.println("It's warm. Go outside!");
        }
    }
}
