package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfCarProduction(2002);
        car1.info();
        System.out.println(car1.yearOfDifference(1999));
        Motorbike motorbike1 = new Motorbike(2010, "black", 4544);
        motorbike1.info();
        System.out.println(motorbike1.yearOfDifference(2011));
    }
}
