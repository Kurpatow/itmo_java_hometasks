package ru.itmo.homeworks.hw20;

import java.io.*;

public class BinHandler<T> {

    private File file;

    public BinHandler() {setFile();}

    private void setFile() {
        file = new File("src/ru/itmo/homeworks/hw20/hw20.bin");
    }

    public void writeToFile(T object) {
        try (FileOutputStream fileOutput = new FileOutputStream(file);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)
        ) {
            objectOutput.writeObject(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public T readFromFile() {
        Object result = null;

        try(FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput)
        ) {
            result = objectInput.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return (T) result;
    }
}
