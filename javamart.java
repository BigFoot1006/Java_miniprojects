package section_three;
import java.util.Scanner;
import java.util.Locale;

public class javamart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("How much money do you have?");
        double yourMoney = scanner.nextDouble();
        double priceCar = 5.99;
        System.out.println("Can I get this car?");
        if(yourMoney >= priceCar) {
            System.out.println("Yes, you can!");
        } else {
            System.out.println("No, you can't!");
        }
        double priceShoes = 95.99;
        System.out.println("Can I get these shoes?");
        if(yourMoney >= priceShoes) {
            System.out.println("Yes, you can!");
        } else {
            System.out.println("No, you can't!");
        }


    }
    
}
