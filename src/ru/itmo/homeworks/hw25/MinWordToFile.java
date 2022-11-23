package ru.itmo.homeworks.hw25;

import java.util.concurrent.CopyOnWriteArrayList;

public class MinWordToFile implements Runnable {

    BinHandler binHandler;
    CopyOnWriteArrayList<String> list;

    public MinWordToFile(CopyOnWriteArrayList<String> list) {
        binHandler = new BinHandler<>();
        this.list = list;
    }
    private void waitThirtySecond() {
        try {
            Thread.sleep(30000);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
   // private String getMinListWord(CopyOnWriteArrayList<String> list) {
       // return list.stream().min((w1.length() - w2.length())).get();
   // }
    private void writeWordToFile(String word) {
        list.remove(word);
    }
    private void deleteWordFormList(String word) {
        list.remove(word);
    }

    @Override
    public void run() {
        waitThirtySecond();
        if (!list.isEmpty()) {
            System.out.println("Коллекция до операций: " + list.toString());
            String minWord = getMinListWord(list);
            writeWordToFile(minWord);
            deleteWordFormList(minWord);
            System.out.println("Слово: " + minWord + " - записано в файл и удалено из коллекции.");
            System.out.println("Коллекция после операций: " + list.toString());
        } else {
            System.out.println("В листе нет элементов: " + list.toString());
        }
    }
}
