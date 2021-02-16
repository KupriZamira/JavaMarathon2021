package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane(567, "Big Airplane", 1990, 566, 56789);
        airplane1.setYear(1995);
        airplane1.setLength(7900);
        airplane1.fillUp(500);
        airplane1.fillUp(50000);
        airplane1.info();
    }
}
