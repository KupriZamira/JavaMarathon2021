package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите числа делитель и делимое");
        Scanner scanner = new Scanner(System.in);
        while(true){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0){
                System.out.println("На ноль делить нельзя");
                break;
            }
            double c = a  / b;
            System.out.println(c);
            continue;
        }

    }
}
