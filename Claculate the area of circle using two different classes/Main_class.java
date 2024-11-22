//Mahmudul(IT23008)

import java.util.Scanner;
public class Main_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.print("Enter the new radius of the circle: ");
        double newRadius = sc.nextDouble();
        circle.setRadius(newRadius);
        System.out.println("Updated Radius: " + circle.getRadius());
        System.out.println("Updated Area: " + circle.calculateArea());

        sc.close();
    }
}