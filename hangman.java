
package section_six;
import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class hangman {
    public static void main(String[] args) {

        String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel", 
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", 
            "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", 
            "moose", "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", 
            "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", 
            "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey","turtle", 
            "weasel", "whale", "wolf", "wombat", "zebra"
        };
        System.out.println("\nHi, my dear contestant!");
        System.out.println("Here it goes the list of the words you should guess the proper one");
        for (int i =0; i < 64; i++) {
            if(i%6 == 0) {
                System.out.println("");
            }
                System.out.print("\t" + (i+1) + ".\t" + words[i]);
        }
        System.out.println("\n");

        drawGallow();

        String secretWord = words[randChoise()];
        // System.out.println(secretWord);
        
        System.out.println(" The secret word is the following: \n");
        for(int i = 0; i < secretWord.length(); i++) {
            System.out.print(" _ ");
        }
        System.out.println("\n");

        int k = 0;
        for(int i = 0; i < secretWord.length(); i++) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
            System.out.println("Choose a letter:");
            char yourLetter = scanner.next().charAt(0);
            
            String guessGood = "";
            String guessBad = "";

            for(int j = 0; j < secretWord.length(); j++) {
                if(secretWord.charAt(j) == yourLetter) {
                    System.out.print(yourLetter);
                    guessGood = guessGood.concat(String.valueOf(yourLetter));
                } else {
                    System.out.print(" _ ");
                    guessBad = guessBad.concat(String.valueOf(yourLetter));
                }
            }
            if(guessGood.equals("")) {
                System.out.println("\n You missed it!");
                k++;
                switch(k) {
                    case 1: {
                        drawGallowPlusHead(); 
                        System.out.println("you tried: " + guessBad);
                        break;
                    }
                    case 2: { 
                        drawGallowPlusHeadPlusBody(); 
                        System.out.println("you tried: " + guessBad);
                        break;
                    }
                    case 3: {
                        drawGallowPlusHeadPlusBodyPlusLimbs(); 
                        System.out.println("you tried: " + guessBad);
                        break;
                    }
                    default: {
                        System.out.println("You lose!");
                        System.out.println("you tried: " + guessBad);
                    }
                }

            }
            else {
                System.out.println("\nGreat job!");
                System.out.println( "You found:" + guessGood);
            }
        }    
    }
    /**
     * function name randChoise
     * @return (String)
     * @param (String)
     * Inside the Function
     * 1. take a list of Strings
     * 2. Randomize the choise
     * 3. return a random word
     */
    public static int randChoise() {
        double randWord = Math.random(); // 0.0001 - 0.9999
        randWord = randWord * 63 + 1;  // 0 - 62.9990 + 1 = 1 - 63.9999
        return (int) randWord;
    }
    /**
     * function drawGallow
     * @param - none
     * @return (String)
     * 
     * Inside the Function
     * 1.draw the gallows
     */
    public static void drawGallow () {
        System.out.print("\t    +---------+\n");
        System.out.print("\t    |         |\n");                    
        System.out.print("\t              |\n");                             
        System.out.print("\t              |\n");                             
        System.out.print("\t              |\n"); 
        System.out.print("\t              |\n"); 
        System.out.print("\t             +++\n"); 
    }
    /**
     * function drawGallowPlusHead
     * @param - none
     * @return (String)
     * 
     * Inside the Function
     * 1.draw the gallows
     */
    public static void drawGallowPlusHead() {
        System.out.print("\t    +---------+\n");
        System.out.print("\t    |         |\n");                    
        System.out.print("\t    O         |\n");                             
        System.out.print("\t              |\n");                             
        System.out.print("\t              |\n"); 
        System.out.print("\t              |\n"); 
        System.out.print("\t              |\n"); 
    }
    /**
     * function drawGallowPlusHeadPlusBody
     * @param - none
     * @return (String)
     * 
     * Inside the Function
     * 1.draw the gallows
     */
    public static void drawGallowPlusHeadPlusBody() {
        System.out.print("\t    +---------+\n");
        System.out.print("\t    |         |\n");                    
        System.out.print("\t    O         |\n");                             
        System.out.print("\t   |||        |\n");                             
        System.out.print("\t              |\n"); 
        System.out.print("\t              |\n"); 
        System.out.print("\t             +++\n"); 
    }
    /* function drawGallowPlusHeadPlusBodyPlusLimbs
     * @param - none
     * @return (String)
     * 
     * Inside the Function
     * 1 draw the gallows
     */
    public static void drawGallowPlusHeadPlusBodyPlusLimbs() {
        System.out.print("\t    +---------+\n");
        System.out.print("\t    |         |\n");                    
        System.out.print("\t    O         |\n");                             
        System.out.print("\t _|||||_      |\n");                             
        System.out.print("\t   | |        |\n"); 
        System.out.print("\t   | |        |\n"); 
        System.out.print("\t             +++\n"); 
    }
}
