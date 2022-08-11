
import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.Exception;

public class Contact {
    private String name;
    private int age;
    private String birthOfDate;
    private String phoneNumber;

    public Contact(String name, int age, String birthOfDate, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.birthOfDate = birthOfDate;
        this.phoneNumber = phoneNumber;
    }
    public Contact(Contact source) {
        this.name = source.name;
        this.age = source.age;
        this.birthOfDate = source.birthOfDate;
        this.phoneNumber = source.phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getBirthOfDate() {
        return birthOfDate;
    }
    public int getAge() {
        return age;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthOfDate(String birthOfDate) {
        this.birthOfDate = birthOfDate;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int calculateAge(String string) throws Exception{
        String yourDateOfBirth = string;
        Date yourDate = new SimpleDateFormat("dd/mm/yyyy").parse(yourDateOfBirth);
        long milisec = yourDate.getTime();
        long milisecCurrent = System.currentTimeMillis();
        long milisecAge = milisecCurrent - milisec;
        double doubleAge = milisecAge/3.1556926e10;
        int yourAge = (int) doubleAge;
        return yourAge;
    } 
    public String toString() {
        return "\nName: " + this.name +
                "\nAge: " + this.age +
                "\nDate of Birth: " + this.birthOfDate + 
                "\nPhone Number: " + this.phoneNumber + "\n";
    }
}

