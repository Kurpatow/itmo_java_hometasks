package ru.itmo.homeworks.hw02;

public class Main {
    public static void main(String[] args) {
        //Задание №1
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

        //Задание №3
        int count = 101;

        if (count <= 100 & count >= 90) {
            System.out.println("Отлично");
        }else if (count <= 89 & count >= 60) {
            System.out.println("Хорошо");
        }else if (count <= 59 & count >= 40) {
            System.out.println("Удовлетворительно ");
        }else if (count <= 39 & count >= 0)  {
            System.out.println("Попробуй в другой раз ");
        }else{
            System.out.println("Неверно введены данные");
        }


        //Задание №4
        int a = (int) (Math.random () * 490 + 10);
        if (a >= 25 && a <= 200) {
            System.out.println (a + " - случайное число из отрезка ПОПАЛО в интервал");
        }
        else {
            System.out.println (a + " - случайное число из отрезка НЕ ПОПАЛО в интервал");
        }

        //Задание №5
        int age = 99;
        int exp = 5;

        if (age > 100){
            System.out.println("Мы Вам перезвоним");
        }else if (exp < 5){
            System.out.println("Вы НЕ подходите на должность стажера");
        }else  if (exp >= 5){
            System.out.println("Вы подходите на должность стажера");
        }else{
            System.out.println("Неверно введены данные");
        }
    }
}
