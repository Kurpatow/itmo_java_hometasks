package hw2;

public class Main {
    public static void main(String[] args) {
        //Задача №1
        int month = 13;

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Несуществующее время года");
        }

        //Задание №2
        int saleCode = 43;
        double sum = 10000;
        switch (saleCode) {
            case 4525:
                System.out.println("Сумма с учётом скижки " + (sum * 0.7) + " руб.");
                break;
            case 6424:
            case 7012:
                System.out.println("Сумма с учётом скижки " + (sum * 0.8) + " руб.");
                break;
            case 7647:
            case 9011:
                System.out.println("Сумма с учётом скижки " + (sum * 0.9) + " руб.");
                break;
            default:
                System.out.println("Сумма без скидки " + sum);
        }
    }
}
