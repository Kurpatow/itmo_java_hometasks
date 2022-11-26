package ru.itmo.homeworks.hw21;

import ru.itmo.homeworks.hw21.common.Message;
import ru.itmo.homeworks.hw21.common.Connection;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TCPServerIO {

    private int port;
    private final String sender = "Server";
    private String messageText;
    private int messageCounter;
    private LocalDateTime dateTime;

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
                Message message = new Message(sender, messageText, dateTime );
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
    private String getCountText() {return "Количество сообщений, обработанных сервером, равно " + this.messageCounter;}

    public static void main(String[] args) {
        new TCPServerIO(TCPPropertiesIO.getServerPort()).run();
    }
}