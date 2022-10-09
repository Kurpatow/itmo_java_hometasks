package ru.itmo.homeworks.hw6.task3;

import ru.itmo.homeworks.hw6.task3.enemies.Cat;
import ru.itmo.homeworks.hw6.task3.enemies.Cat2;
import ru.itmo.homeworks.hw6.task3.enemies.Mouse;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat2 cat2 = new Cat2();
        Mouse mouse = new Mouse();

        cat1.showInfo();
        cat2.showInfo();

    }
}
