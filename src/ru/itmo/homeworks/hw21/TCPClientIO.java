package ru.itmo.homeworks.hw21;

import ru.itmo.homeworks.hw21.common.Connection;
import ru.itmo.homeworks.hw21.common.Message;

import java.io.IOException;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TCPClientIO {
    private final String ip;  // адрес серверной машины
    private final int port;   // порт, на котором серверная программа ожидает клиента

    private LocalDateTime receiptMessageTime;

    public TCPClientIO(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        while (true) {
            System.out.println("Введите сообщение: ");
            String text = scanner.nextLine();

            if ("/exit".equalsIgnoreCase(text)) {
                System.out.println("Закрытие приложения");
                return;
            }

            Message message = new Message(name, text);

            try (Connection<Message> connection = new Connection<>(new Socket(ip, port))) {
                connection.sendMessage(message);
                Message fromServer = connection.readMessage();
                System.out.println("Сообщение от сервера: " + fromServer);
                receiptMessageTime = LocalDateTime.now();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Обработка IOException | ClassNotFoundException");
            } catch (Exception e) {
                System.out.println("Обработка Exception");
            }

            if ("/ping".equalsIgnoreCase(text)) {
                System.out.println("Время обмена сообщениями с сервером: " + getPingTime(message) + " мс");
            }
        }
    }


    private int getPingTime(Message message) {
        return (receiptMessageTime.getNano() - message.getDateTime().getNano()) / 1_000_000;
    }

    public static void main(String[] args) {
        new TCPClientIO(TCPPropertiesIO.getClientIP(), TCPPropertiesIO.getClientPort()).run();
    }
}