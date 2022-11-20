package ru.itmo.homeworks.hw3;

public class Task4 {
    public static void main(String[] args) {
        int min = 1;
        int max = 9;
        int dip = max - min; // Диапазон
        int ii = min + (int) (Math.random() * ++(dip));
        int user;

        user = 8;
        while (true) {
            if (user == 0) {
                System.out.println("Выход из программы");
                break;
            }
            else if (user != 0 && (user < min || user > max)) {
                System.out.println("Число выходит за диапазон");
                break;
            } else {
                if (user < ii) {
                    System.out.println("Загаданное число больше. Я загадал " + ii);
                    break;
                } else if (user > ii) {
                    System.out.println("Загаданное число меньше. Я загадал " + ii);
                    break;
                } else if (user == ii) {
                    System.out.println("Вы угадали! Это число " + ii);
                    break;
                }
            }
        }
    }
}
