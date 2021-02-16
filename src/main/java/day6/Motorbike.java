package day6;


public class Motorbike {
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
    public void info(){
        System.out.println("Это мотоцикл");
    }

    int yearOfDifference(int inputYear){
        int difference = yearOfIssueMotorbike - inputYear;
        return Math.abs(difference);
    }
}





