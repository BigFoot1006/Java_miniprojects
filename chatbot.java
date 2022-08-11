package section_two;
import java.util.Scanner;
import java.util.Locale;

public class chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Hello! \nWhat's your name?");
        String yourName = scanner.nextLine();
        System.out.println("Hi " + yourName + "! I am a Javabot. Where are you from?");
        String yourCity = scanner.nextLine();
        System.out.println("I hear it's beautiful at " + yourCity + "! I am from a place called Oracle");
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("So, you are " + age +", cool! I'm 400 years old!");
        System.out.println("This means I'm " + 400/age +" times older than you!");
        scanner.nextLine();
        System.out.println("Enough about me! What's your favorite language? (just don't say Python");
        String yourLanguage = scanner.nextLine();
        System.out.println(yourLanguage + ", that's great! Nice chatting with you " + yourName + ". I have to log off now. See ya!");
        scanner.close();;
    }
    
}
