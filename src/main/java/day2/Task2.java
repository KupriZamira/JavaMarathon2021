

package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a и b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b){
            System.out.println("a >= b некорректный ввод");
        }
        for (int a1 = a; a1 < b; a1++) {
            if (a1 % 5 == 0 && a1 % 10 != 0) {
                System.out.print(a1 + " ");
            }
        }


    }

}




