package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(1990, "black", 4368);
        motorbike.getYearOfIssueMotorbike();
        motorbike.getColourMotorbike();
        motorbike.getModelMotorbike();
    }
}

class Motorbike{
    int yearOfIssueMotorbike;
    String colourMotorbike;
    int modelMotorbike;

    public Motorbike(int yearOfIssueMotorbike, String colourMotorbike, int modelMotorbike){
        this.yearOfIssueMotorbike = yearOfIssueMotorbike;
        this.colourMotorbike = colourMotorbike;
        this.modelMotorbike = modelMotorbike;
    }

    public int getYearOfIssueMotorbike() {
        System.out.println("Год выпуска: " + yearOfIssueMotorbike);
        return yearOfIssueMotorbike;
    }
    public String getColourMotorbike(){
        System.out.println("Цвет: " + colourMotorbike);
        return colourMotorbike;
    }
    public int getModelMotorbike(){
        System.out.println("Модель " + modelMotorbike);
        return modelMotorbike;
    }
}





