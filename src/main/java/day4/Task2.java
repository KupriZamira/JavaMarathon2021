package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int nums[] = new int [100];
        int largestElement = 0;
        int leastElement = 1000;
        int numElements = 0;
        int sumElements = 0;
        for (int i = 0; i < 100; i++){
            nums[i] = random.nextInt(10000);
        }


        for (int j: nums) {
            if(j > largestElement){
                largestElement = j;
            }
            if(j < leastElement){
                leastElement = j;
            }

            if (j % 10 == 0){
                numElements++;
                sumElements = sumElements + j;
            }



        }


        System.out.println(Arrays.toString(nums));
        System.out.println("Наибольший элемент массива: " + largestElement);
        System.out.println("Наименьший элемент массива: " + leastElement);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + numElements);
        System.out.println("Cумма элементов массива, оканчивающихся на 0: " + sumElements);


    }
}
