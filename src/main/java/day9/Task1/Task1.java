package day9.Task1;


public class Task1 {
    public static void main(String[] args) {
        Students student1 = new Students("Patric", "Maths");
        student1.printInfo();
        System.out.println(student1.getGroupName());

        Teacher teacher1 = new Teacher("Tatyana Pavlovna", "Maths");
        teacher1.printInfo();
        System.out.println(teacher1.getSubjectName());
    }
}
