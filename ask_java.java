package section_three;
public class ask_java {
    public static void main(String[] args) {
        System.out.println("Hi Java, do I have enough change to buy chips?");
        double yourChange = 3.5;
        double priceChips = 2.5;
        System.out.println("Java: " + (yourChange > priceChips));

        System.out.println("Hi Java, can the elevator hold everyone?");
        int numberOfPersons = 15;
        int elevatorCapacity = 12;
        System.out.println("Java: " + (numberOfPersons <= elevatorCapacity));

        System.out.println("Hi Java, will my friend be happy?");
        String yourFriendWish = "PS5";
        String yourOffer = "toy car";
        System.out.println("Java: " + (yourFriendWish.equals(yourOffer)));

        System.out.println("Hi Java, can everyone attend my dinner party?");
        int space = 10;
        int guestRoom = 8;
        System.out.println("Java: " + (space>=guestRoom));
        System.out.println("Hi Java, will I win the election?");
        int yourVotes = 10;
        int yourCompetitorVotes = 8;
        System.out.println("Java: " + (yourVotes>yourCompetitorVotes));
    }
    
}
