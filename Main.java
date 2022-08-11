
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.lang.Exception;

public class Main {
    public static void main(String[] args)  throws Exception {
        ArrayList<Contact> person = new ArrayList<Contact>();
        Contact contact = new Contact("", 0, "", "");
       
        person.add(contact);

        /*
        Scanner scanner = new Scanner(System.in).useLocale(Locale.FRANCE);
        */
        System.out.println("insert your date of birth in the following format: dd/mm/yyyy");
        /*
        String birthOfDate = scanner.nextLine();
        scanner.close();
        */
        

        try {
            File myFile = new File("../section_nine/contacts.txt");
            Scanner scannerFile = new Scanner(myFile);


            for (int i = 0; i < person.size(); i++) {
                if(scannerFile.hasNextLine()) {
                    contact.setName(scannerFile.nextLine());
                    contact.setBirthOfDate(scannerFile.nextLine());
                    contact.setPhoneNumber(scannerFile.nextLine());
                    contact.setAge(contact.calculateAge(contact.getBirthOfDate()));
                    person.add(contact);      
                    System.out.println(person.get(i));              
                }   
            }
            scannerFile.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("The file hasn't been found");
            e.printStackTrace();
        }
        
    }
}
