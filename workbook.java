package section_three;
import java.util.Scanner;
import java.util.Locale;
public class workbook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("today:");
        String dayToday = scanner.nextLine();
        if(dayToday.equals("Saturday") || dayToday.equals("Sunday")) {
            System.out.println("it's the weekend, no work!");
        } else if (dayToday.equals("holiday")) { 
            System.out.println("Woohoo, no work");
        } else {
            System.out.println("Wake up at 7:00 :(");
            scanner.close();
        }
    }
}
