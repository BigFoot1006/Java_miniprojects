package section_six;

public class jim_apples {
    public static void main(String[] args) {
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] prices = {1.99, 1.49, 1.29};
        System.out.println("\nHere's your receipt\n"); 
        for(int i = 0; i < apples.length; i++) {
            System.out.println(apples[i] + "\t" + prices[i] + "\n");
        }
    }
    
}
