package section_five;

public class odds_even {
    public static void main(String[] args) {
        for(int i = 0; i<=19; i++) {
            String check;
            if (i%2 ==0) {
                check = "even";
            } else {
                check = "odds";
            }
            System.out.println(i + " " + check);
        }

    }
    
}
