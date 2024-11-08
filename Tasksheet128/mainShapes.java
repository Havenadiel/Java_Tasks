
public class mainShapes {
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
