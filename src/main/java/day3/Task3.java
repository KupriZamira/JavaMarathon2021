package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите числа делитель и делимое");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0) {
                System.out.println("Деление на ноль");
                continue;
            }
            double c = a / b;
            System.out.println(c);
            continue;


        }
    }
}