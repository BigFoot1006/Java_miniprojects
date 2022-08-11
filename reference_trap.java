package section_six;
import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class reference_trap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Abby", "Joel", "Mike", "Clement"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear,staffLastYear.length);
        staffThisYear[1] = "Robert";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
