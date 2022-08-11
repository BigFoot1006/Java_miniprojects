package section_six;
import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class lottery_tickets {
    public static void main(String[] args) {
        int[] ticket1 = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = new int[ticket1.length];
        ticket2 =Arrays.copyOf(ticket1, ticket1.length);
        ticket2[2] = 54;
        System.out.println(Arrays.toString(ticket1)+ "\n" + Arrays.toString(ticket2));
    }
}
