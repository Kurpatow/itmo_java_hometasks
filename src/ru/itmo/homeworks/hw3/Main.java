package ru.itmo.homeworks.hw3;

public class Main {
    public static void main(String[] args) {
        //Задание №1
        //Подзадание(1)
        for (int a = 90; a > 0; a -= 5) {
            System.out.println(a);
        }
        //Подзадание(2)
        for (int b = 2; b <= 10; b += 2) {
            System.out.println(b);
        }
        //Задание №2
        int z = 12;
        int sum = 0;
        while (z > 0){
            sum += z % 10;
            z = z / 10;
        }
        System.out.println(sum);
        //Задание №3 - в отдельном классе Task3
        //Задание №4 - в отдельном классе Task4
    }
}

