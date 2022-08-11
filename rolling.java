package section_five;

public class rolling {
    public static void main(String[] args) {
        System.out.println("Great, here are the rules:\n");
        System.out.println(">> - If you roll a 6 the game stops.\n>> - If you roll a 4 nothing happens.\n>> - Otherwise, you get 1 point\n.");
        int yourScore =0;
        while(yourScore < 3) {
            switch (RandomDice()) {
                case 1: {
                    yourScore++; 
                    System.out.println("Your score is " + yourScore);
                }
                case 2: {
                    yourScore++; 
                    System.out.println("Your score is " + yourScore);
                }
                case 3: {
                    yourScore++; 
                    System.out.println("Your score is " + yourScore);
                }
                case 4: {
                    System.out.println("Your score is " + yourScore);
                }
                case 5: {
                    yourScore++; 
                    System.out.println("Your score is " + yourScore);
                }
                case 6: {
                    System.out.println("Your score is " + yourScore);
                    break;
                }
                default: {
                    break;
                }
            }
            if(yourScore ==3) {
                System.out.println("Your score is reaching out to " + yourScore);
                System.out.println("you win!");
            }
        }

    }
    /**
     * Function Name: RandomDice 
     * @return dice (int)
     * Inside the function:
     * 1. Yields a random number, int range 1-6
     * 2. It returns this number
     * 
     */
    public static int RandomDice() {
        double rand = Math.random();
        rand = rand * 6;
        int dice = (int) rand +1;
        return dice;
    }
}
/*
 * range 0.0001 - 0.9999
 * range 0.0001 - 5.9999
 * range 1.0001 - 6.9999
 * (int) range 1 - 6
 */