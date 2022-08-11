package section_three;
import java.util.Scanner;
import java.util.Locale;
public class calendar {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Check your calendar!");
        System.out.println("What day is today? Please insert a weekday:");
        String weekDay = scanner.nextLine();
        switch (weekDay) {
            case "Monday" : System.out.println("Sorry, I have to stay at work late."); break; 
            case "Tuesday" : System.out.println("It looks like I have meetings all day."); break; 
            case "Wednesday" : System.out.println("I have a dentist appointment. Some other time!"); break; 
            case "Thursday" : System.out.println("Sorry, thursday is date night!"); break; 
            case "Friday" : System.out.println("I'm free!!"); break; 
            case "Saturday" : System.out.println("I'm free!!"); break; 
            case "Sunday" : System.out.println("I'm free!!"); break; 
            default : System.out.println("that's not a day.");
        }
        scanner.close();
    }
}
