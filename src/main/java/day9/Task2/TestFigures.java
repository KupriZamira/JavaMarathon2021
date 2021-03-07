package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5),
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double calculateRedPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            if ("Red" == figures[i].getColor()) {
                calculateRedPerimeter = calculateRedPerimeter + figures[i].perimeter();
            }
        }
        return calculateRedPerimeter;
    }

    public static double calculateRedArea(Figure[] figures){
        double calculateRedArea = 0;
        for (int i = 0; i < figures.length; i++){
            if ("Red" == figures[i].getColor()){
                calculateRedArea = calculateRedArea + figures[i].area();
            }
        }
        return calculateRedArea;
    }
}