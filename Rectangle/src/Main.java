import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = scanner.nextFloat();
        System.out.println("Enter the height:");
        double height = scanner.nextFloat();

        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter "+ rectangle.getPerimeter());
        System.out.println("Area " + rectangle.getArea());
    }
}
