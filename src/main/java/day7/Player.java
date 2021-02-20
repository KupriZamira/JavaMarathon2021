package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers > 6) {
            countPlayers = 6;
        }
    }
    public int getStamina() {
        System.out.println("Выносливость: " + stamina);
        if (stamina == 0){
            countPlayers--;
        }
        return stamina;
    }
    public int getCountPlayers() {
        System.out.println("Количество игроков: " + countPlayers);
        return countPlayers;
    }
    public void run() {
        //stamina--;
        stamina = stamina / 100; //чтобы быстрее проверить выход из игры
    }
    public void info() {
        if (countPlayers > 6) {
            System.out.println("На поле нет свободных мест. Для игры нужно всего 6 игроков");
        } else if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест. Уже есть 6 игроков");
        } else if (countPlayers == 5) {
            System.out.println("Команды неполные. На поле еще есть 1 свободное место");
        } else if (countPlayers == 4) {
            System.out.println("Команды неполные. На поле еще есть 2 свободных места");
        } else if (countPlayers == 3) {
            System.out.println("Команды неполные. На поле еще есть 3 свободных места");
        } else if (countPlayers == 2) {
            System.out.println("Команды неполные. На поле еще есть 4 свободных места");
        } else if (countPlayers == 1) {
            System.out.println("Для игры нужно еще 5 игроков");
        }
    }
}