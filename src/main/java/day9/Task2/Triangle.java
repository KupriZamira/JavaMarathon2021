package day9.Task2;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    public Triangle (int a, int b, int c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double area(){
        int p = (a + b + c)/2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
    @Override
    public double perimeter(){
        double perimeter = a + b + c;
        return perimeter;
    }
}


