
public class Circle extends abstractShapes {
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
