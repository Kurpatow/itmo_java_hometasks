package ru.itmo.homeworks.hw25;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BinHandler<T> {

    private File file;

    public BinHandler() {setFile();}

    private void setFile() {
        file = new File("src/ru/itmo/homeworks/hw25.bin");
    }
    public void writeToFile(T object) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(object);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
