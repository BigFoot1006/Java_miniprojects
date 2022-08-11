
package section_five;

public class nested_loops {
    public static void main(String[] args) {
        for(int i =0; i<3; i++) {
            System.out.println("round " + i);
            for(int j = 0; j < 3; j++) {
                System.out.println("\tcount " + j );
            }
        }
    }
}
