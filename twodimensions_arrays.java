package section_six;
import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;
public class twodimensions_arrays {
    public static void main(String[] args) {
        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };
        String[] names = {"Harry", "Ron", "Hermione"};
        for (int i = 0; i < names.length; i++) {
        System.out.println(names[i] + " grades: \t" + Arrays.toString(grades[i]));
        }
    }
}
