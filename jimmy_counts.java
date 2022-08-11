package section_five;
import java.util.Scanner;
import java.util.Locale;

public class jimmy_counts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("\nHi Jimmy! I hear you like to count by three?");
        System.out.println("Pick a number to count by");
        int number1 = scanner.nextInt();
        System.out.println("Pick a number to start counting from:");
        int number2 = scanner.nextInt();
        System.out.println("Pick a number to count to: ");
        int number3 = scanner.nextInt();
        count(number1, number2, number3);
    }
    public static void count(int n1, int n2, int n3) {
        for (int i= n2; i<=n3; i+=n1) {
            System.out.print(i + " ");
        }
    }
}

