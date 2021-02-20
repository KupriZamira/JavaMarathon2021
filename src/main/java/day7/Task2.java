package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
            Player player1 = new Player(randomCount(90, 100));
            player1.getStamina();
            player1.run();
            player1.getStamina();
        Player player2 = new Player(randomCount(90, 100));
        Player player3 = new Player(randomCount(90, 100));
        Player player4 = new Player(randomCount(90, 100));
        Player player5 = new Player(randomCount(90, 100));
        Player player6 = new Player(randomCount(90, 100));
        player6.getCountPlayers();
        player1.info();
    }

    public static int randomCount(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}





