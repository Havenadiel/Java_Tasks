
public class Rectangle extends abstractShapes {

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
