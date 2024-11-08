public abstract class abstractShapes implements Shapes {
    protected String color;
    protected double length;
    protected double width;

    public abstractShapes(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
