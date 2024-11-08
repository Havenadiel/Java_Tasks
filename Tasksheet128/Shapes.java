public interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

public abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

public class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); 
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; 
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; 
    }
}

public class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width; 
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width); 
    }
}

public class Main {
    public static void main(String[] args) {
 
        Circle circle = new Circle("Red", 5); 
        Rectangle rectangle = new Rectangle("Blue", 4, 6);

        System.out.println("Circle:");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
