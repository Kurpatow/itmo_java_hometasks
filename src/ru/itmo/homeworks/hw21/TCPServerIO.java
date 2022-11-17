package ru.itmo.homeworks.hw21;

import ru.itmo.homeworks.hw21.common.Message;
import ru.itmo.homeworks.hw21.common.Connection;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerIO {
    private final int port;

    private final String sender = "Server";

    private String messageText;

    private int messageCounter;

    public TCPServerIO(int port) {
        this.port = port;
        this.messageCounter = 0;
    }

    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен...");
            while (true) {
                // Связь устанавливается между Socket у клиента и Socket (который создается через метод accept) у сервера
                Socket socket = serverSocket.accept(); // Пока клиент не подключится дальше инструкции не выполняются
                // взаимодействие с клиентом (получение и передача информации)
                Connection<Message> connection = new Connection<>(socket);
                Message fromClient = connection.readMessage();
                System.out.println("От клиента: " + fromClient);

                messageCounter++;

                if ("/help".equalsIgnoreCase(fromClient.getText())) {
                    messageText = getHelpText();
                } else if ("/count".equalsIgnoreCase(fromClient.getText())) {
                    messageText = getCountText();
                } else {
                    messageText = "Сообщение от сервера";
                }

                Message message = new Message(sender, messageText);
                connection.sendMessage(message);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Обработка IOException или ClassNotFoundException");
        }
    }

    private String getHelpText() {
        String text = "\n" +
                "Команда    /help    - отобразить справку по командам" + "\n" +
                "Команда    /count   - отобразить количество сообщений, обработанное сервером" + "\n" +
                "Команда    /ping    - отобразить время, за которое сообщение доходит до сервера и возвращается обратно"
                + "\n" +
                "Команда    /exit    - закрыть клиентское приложение";
        return text;
    }

    private String getCountText() {
        return "Количество сообщений, обработанных сервером, равно " + this.messageCounter;
    }
    public static void main(String[] args) {
        // Integer.parseInt(); -> возвращает int
        // Integer.valueOf(); -> возвращает Integer

        // что делать, если аргумент не задан, его нельзя преобразовать в int
        // или число не может быть использовано в качестве значения port?

        new TCPServerIO(Integer.parseInt(args[0])).run();
    }
}