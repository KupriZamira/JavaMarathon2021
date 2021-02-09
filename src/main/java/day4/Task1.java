package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int counterAbove8 = 0;
        int counterEquals1 = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        int n = scanner.nextInt();
        int[] array = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            array[i] = random.nextInt(10);
        }

            for (int j = 0; j < n; j++) {
                if (array[j] > 8) {
                    counterAbove8++;
                }
                if (array[j] == 1) {
                    counterEquals1++;
                }
                if (array[j] % 2 == 0) {
                    evenNumbers++;
                }
                if (array[j] % 2 != 0) {
                    oddNumbers++;
                }

        }
            int sumElements = 0;
             for (int k = 0; k < n; k++){
                 sumElements = array[k] + sumElements;
             }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + counterAbove8);
        System.out.println("Количество чисел равных 1: " + counterEquals1);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + oddNumbers);
        System.out.println("Сумма всех элементов массива: " + sumElements);

        }


}






























