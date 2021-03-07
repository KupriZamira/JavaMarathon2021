package day9.Task2;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double area(){
        double area = width * height;
        return area;

    }
    @Override
    public double perimeter(){
        double perimeter = (width + height) * 2;
        return perimeter;
    }
}