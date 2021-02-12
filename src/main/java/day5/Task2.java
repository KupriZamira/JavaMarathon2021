package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(1990, "black", 4368);
        System.out.println(motorbike.getYearOfIssueMotorbike());
        System.out.println(motorbike.getColourMotorbike());
        System.out.println(motorbike.getModelMotorbike());
    }
}

class Motorbike{
    private int yearOfIssueMotorbike;
    private String colourMotorbike;
    private int modelMotorbike;

    public Motorbike(int yearOfIssueMotorbike, String colourMotorbike, int modelMotorbike){
        this.yearOfIssueMotorbike = yearOfIssueMotorbike;
        this.colourMotorbike = colourMotorbike;
        this.modelMotorbike = modelMotorbike;
    }

    public int getYearOfIssueMotorbike() {
        return yearOfIssueMotorbike;
    }
    public String getColourMotorbike(){
        return colourMotorbike;
    }
    public int getModelMotorbike(){
        return modelMotorbike;
    }
}





