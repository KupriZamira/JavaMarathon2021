package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student1 = new Student("Петров Иван");
        Teacher teacher1 = new Teacher("Ольга Алексеевна", "история");
        teacher1.evaluate("Петров Иван");
    }
}
