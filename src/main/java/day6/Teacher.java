package day6;

import java.util.Random;

public class Teacher {
    private String nameTeachers;
    private String subject;
    Random random = new Random();
    String rating;
    String ratingNeud = "неудовлетворительно";
    String ratingUdov = "удовлетворительно";
    String ratingHorosho = "хорошо";
    String ratingOtlichno = "отлично";


    public Teacher(String nameTeachers, String subject){
        this.nameTeachers = nameTeachers;
        this.subject = subject;
    }

    public void setNameTeachers(String nameTeachers){
        this.nameTeachers = nameTeachers;
    }
    public String getNameTeachers(){
        return nameTeachers;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void evaluate(String nameStudents){
        int i = random.nextInt(5) + 1;
        int min = 2;
        if(min > i){
            i = min;
        }

        if (i == 2){
           rating = ratingNeud;
       } else if (i == 3){
            rating = ratingUdov;
        } else if (i == 4){
            rating = ratingHorosho;
        } else {
            rating = ratingOtlichno;
        }
        System.out.println(nameTeachers + " оценил(а) студента " + nameStudents + " " + "по предмету " + subject + " на оценку: " + rating);
    }
}
