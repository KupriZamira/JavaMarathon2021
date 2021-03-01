package day8;

public class Task1 {
    public static void main(String[] args) {

        String str = "";
        for(int i = 0; i <= 2000; i++) {
            str = str + i + " ";
        }
        System.out.println(str);

        long startTime = System.nanoTime();
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);


        StringBuilder string1 = new StringBuilder();
        for (int i = 0; i <= 2000; i++){
            string1.append(i + " ");
        }
        System.out.println(string1.toString());

        long estimatedTime1 = System.nanoTime() - startTime;
        System.out.println(estimatedTime1);
    }
}

