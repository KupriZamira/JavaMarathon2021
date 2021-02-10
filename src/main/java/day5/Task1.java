package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfCarProduction(2015);
        car1.setColour("red");
        car1.setModel(3454);

        System.out.println(car1.getYearOfCarProduction());
        System.out.println(car1.getColour());
        System.out.println(car1.getModel());
    }
}
    class Car{
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
}


