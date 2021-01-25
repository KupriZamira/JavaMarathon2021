package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число x");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x >= 5){
            double y = (Math.pow(x, 2) - 10) / (x + 7);
            System.out.println(y);
        }else if(- 3 < x && x < 5){
            double y = (x + 3) * (Math.pow(x, 2) - 2);
            System.out.println(y);
        }else {
            double i = 420;
            System.out.println(i);
        }

    }

}
