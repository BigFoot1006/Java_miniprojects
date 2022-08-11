package section_three;
public class Parameters {
    public static void main(String[] args) {
        rectangleArea(10,2);
        rectangleArea(3.4, 1.2);
        rectangleArea(6.9, 4.3);
        rectangleArea(11.56, 3.21);
    }
    public static void rectangleArea(double length, double width) {
        double area = length * width;
        System.out.println("\nThe area of a rectangle with length of " + length + " and a width of " + width + " is equal with " + area + "\n");
    }
}
