package ru.itmo.homeworks.hw25;

import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MinWordToFile implements Runnable {

    BinHandler<? extends Object> binHandler;
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
   private String getMinListWord(CopyOnWriteArrayList<String> list) {
        return list.stream().min(Comparator.comparingInt(String::length)).get();
    }
    private void writeWordToFile(String word) {
        binHandler.writeToFile(word);
    }
    private void deleteWordFormList(String word) {
        list.remove(word);
    }

    @Override
    public void run() {
        waitThirtySecond();
        if (!list.isEmpty()) {
            System.out.println("Коллекция до операции: " + list);
            String minWord = getMinListWord(list);
            writeWordToFile(minWord);
            deleteWordFormList(minWord);
            System.out.println("Слово: " + minWord + " - записано в файл и удалено из коллекции.");
            System.out.println("Коллекция после операции: " + list.toString());
        } else {
            System.out.println("В листе нет элементов: " + list);
        }
    }
}
