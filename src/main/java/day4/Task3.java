package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [][] array = new int [3] [3];
        Random random = new Random();
        int sum = 0;
        int line = 0;
        int indexString = 0;



        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array [i][j] = random.nextInt(5);
                System.out.print(array[i][j] + " ");
                sum = sum + array [i][j];
            }

            if(sum > line){
                line = sum;
                indexString = i;

            }


            sum = 0;
            System.out.println();
        }



        System.out.println("Индекс строки, где сумма чисел максимальна: " + indexString);


        }

    }

