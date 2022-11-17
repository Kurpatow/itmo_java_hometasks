package ru.itmo.homeworks.hw21.common;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connection <T extends Message> implements AutoCloseable{
    private Socket socket; // олицетворяет соединение между клиентом и сервером
    private ObjectInputStream input;
    private ObjectOutputStream output;

    public Connection(Socket socket) throws IOException {
        this.socket = socket;
        output = new ObjectOutputStream(this.socket.getOutputStream());
        input = new ObjectInputStream(this.socket.getInputStream());
    }

    public void sendMessage(T message) throws IOException{
        message.setDateTime();
        output.writeObject(message);
        output.flush(); // принудительно выталкиваем данные. Иначе данные застрянут
    }

    public T readMessage() throws IOException, ClassNotFoundException{
        return (T) input.readObject();
    }

    @Override
    public void close() throws Exception {
        input.close();
        output.close();
        socket.close();
    }
}
