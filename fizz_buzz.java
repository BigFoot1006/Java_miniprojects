package section_five;

public class fizz_buzz {
    public static void main(String[] args) {
        for(int i = 0; i<=18; i++) {
            String check ="";
            if (i%3 ==0) {
                check = "fizz";
            } 
            if (i%5 ==0) {
                check = "buzz";
            }
            if(i%3==0 && i%5==0) {
                check = "fizzbuzz";
            }
            System.out.println(i + " " + check);
        }
    }
}
