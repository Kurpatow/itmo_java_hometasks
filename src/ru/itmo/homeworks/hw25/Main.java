package ru.itmo.homeworks.hw25;

import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        StringToList task01 = new StringToList(list);
        Thread thread01 = new Thread(task01);
        thread01.setDaemon(true);

        MinWordToFile task02 = new MinWordToFile(list);
        Thread thread02 = new Thread(task02);

        thread01.start();
        thread02.start();

        try {
            thread02.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
