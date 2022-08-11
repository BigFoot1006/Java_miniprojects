
package section_three;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

import java.util.Locale;

public class championship {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("\nIf Gryffindor beats Ravenclaw by a margin of three hundred points, they would win the championship. If they win by any number of points or tie, they would come second. If they lose by less than a hundred points, they come third behind Hufflepuff. If they lose by more than a hundred points, they would be in fourth place\n");
        System.out.println("Insert Gryffindor points:");
        int pointsGryffindor = scanner.nextInt();
        System.out.println("Insert Ravenclaw points:");
        int pointsRavenclaw = scanner.nextInt();
        scanner.close();
        if((pointsGryffindor - pointsRavenclaw) >= 300) {
        System.out.println("Gryffindors win the championship");
        } else if((pointsGryffindor - pointsRavenclaw) < 300) {
        System.out.println("Gryffindors are in the second position in the championship");
        } else if((pointsGryffindor - pointsRavenclaw) < 0) {
        System.out.println("Gryffindors are in the third position in the championship");    
        } else if((pointsGryffindor - pointsRavenclaw) < -100) {
        System.out.println("Gryffindors are in the forth position in the championship");        
        }
    }   
}
