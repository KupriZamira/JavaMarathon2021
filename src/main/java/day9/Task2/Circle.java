package day9.Task2;

public class Circle extends Figure {
    private int circleRadius;

    public Circle (String color, int circleRadius){
        super(color);
        this.circleRadius = circleRadius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double area() {
        double area = 3.14 * circleRadius;
        return area;
    }
    @Override
    public double perimeter() {
        double perimeter = 2 * 3.14 * circleRadius;
        return perimeter;

    }
}
