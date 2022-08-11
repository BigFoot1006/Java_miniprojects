package section_five;

public class bottles {
    public static void main(String[] args) {
        System.out.print( "99 bottles of beer on the wall, 99 bottles of beer! take one down, pass it around,");
        printBottle();
    }
    public static void printBottle() {
        for(int i = 98; i >= 1; i--) {
            System.out.print(i + " bottles of beer on the wall, " + i + " bottles of beer on the wall, " + i + " bottles of beer! take one down, pass it around,");
        }
    }
}
