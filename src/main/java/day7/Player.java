package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers <= 6) {
            countPlayers++;
        }
    }
    public int getStamina() {
        return stamina;
    }
    public int getCountPlayers() {
        return countPlayers;
    }
    public void run() {
        stamina = stamina / 200;
        if(stamina == 0){
            countPlayers--;
        }
    }
    public void info() {
        if (countPlayers >= 6) {
            System.out.println("Команды полные. Есть " + countPlayers + " игроков");
        } else if (countPlayers >= 1 && countPlayers <= 5) {
            System.out.println("Команды неполные. На поле есть " + countPlayers + " мест");
        }
        }
    }
