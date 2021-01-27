package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите город");
        Scanner scanner = new Scanner(System.in);
        String stop = "Stop";
        do {
            String city = scanner.nextLine();
            if (stop.equals(city)){
                break;
            }
            switch (city) {
                case "Владивосток":
                case "Москва":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин ":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн ":
                    System.out.println("Германия");
                    break;

                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
        } while (true);

    }
}

