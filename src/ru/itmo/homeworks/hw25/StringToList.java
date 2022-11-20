package ru.itmo.homeworks.hw25;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringToList implements Runnable {
    Scanner scanner;

    CopyOnWriteArrayList<String> list;

    public StringToList(CopyOnWriteArrayList<String> list) {
        scanner = new Scanner(System.in);
        this.list = list;
    }
    private String getWord() {
        System.out.println("Введите слово: ");
        return scanner.nextLine();
    }
    private void putWordToList() {
        list.add(getWord());
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            putWordToList();
            System.out.println(!Thread.currentThread().isInterrupted() + " " + Thread.currentThread().getName());
        }
    }
}
