package day6;

public class Car {
    private int yearOfCarProduction;
    private String colour;
    private int model;

    public void setYearOfCarProduction(int yearOfCar) {
        yearOfCarProduction = yearOfCar;
    }
    public int getYearOfCarProduction() {
        return yearOfCarProduction;
    }
    public void setColour(String colourCar) {
        colour = colourCar;
    }
    public String getColour() {
        return colour;
    }
    public void setModel(int modelCar) {
        model = modelCar;
    }
    public int getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    int yearOfDifference(int inputYear) {
        int difference = inputYear - yearOfCarProduction;
        return Math.abs(difference);
    }
}

