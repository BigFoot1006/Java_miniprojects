public class math_operators {
    public static void main(String[] args) {
        int bagOfSweets1 = 5, bagOfSweets2 = 10;
        long starInMilkyWay = 2500000000L, starsInAndromeda =100000000000L;
        double testScore = 6.7, bonusMark = 2.5;
        
        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + "sweets");
        System.out.println("There are " + (starInMilkyWay + starsInAndromeda) + "stars in the Milky Way and Andromeda galaxies");
        System.out.println("With bonus marks, Ron scored " + (testScore + bonusMark) + "/10, on his potions test. " + "Snape wasn't too thrilled.");
        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + "more sweets than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starInMilkyWay) + "more stars than the Milky Way");
        System.out.println("Snape ended up removing marks. Ron actually scored " + (testScore - bonusMark) + " on his potions test");
        System.out.println("Fred and George used a special spell to multiply their sweets to: " + (bagOfSweets1*bagOfSweets2));
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore*bonusMark) + "/10");
        System.out.println("Originally, Fred had " + (bagOfSweets2/bagOfSweets1) + " times more sweets than George");
        System.out.println ("Andromeda has " + (starsInAndromeda/starInMilkyWay) + " times more stars");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore/bonusMark));
        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10%2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5%2));
        
        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println("I count " + counter);
        counter--;
        counter--;
        counter--;
        System.out.println(counter);
        System.out.println(counter+=3);
        System.out.println(counter-=3);


        System.out.println();
        
        
        // 
        
        // 
    }
}
