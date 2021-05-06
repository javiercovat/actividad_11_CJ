import java.util.Scanner;

public class Circle implements Shape {
    public static final double PI = 3.141592;

    protected double radius;

    public double getRadius() {
        System.out.println();
        System.out.println("Ingresa el radio del círculo: ");
        Scanner lector = new Scanner(System.in);
        radius = lector.nextInt();
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getArea() {
        return radius*radius*PI;
    }

    public double getPerimeter() {
        return PI * getDiameter();
    }

}


