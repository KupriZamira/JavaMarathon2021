package day6;

public class Car {
    private int yearOfCarProduction;
    public void setYearOfCarProduction (int yearOfCar){
        yearOfCarProduction = yearOfCar;
    }
    public int getYearOfCarProduction (){
        return yearOfCarProduction;
    }
    private String colour;
    public void setColour(String colourCar){
        colour = colourCar;
    }
    public String getColour(){
        return colour;
    }
    private int model;
    public void setModel (int modelCar) {
        model = modelCar;
    }
    public int getModel(){
        return model;
    }
    public void info(){
        System.out.println("Это автомобиль");
    }
    int yearOfDifference(int inputYear){
        int difference = inputYear - yearOfCarProduction;
        if (difference < 0){
            difference = - difference;
        }
        return difference;
    }
}


