package ru.itmo.homeworks.hw21;

public class CountCommand extends Command {
    public CountCommand(TCPServerIO tcpServerIO) {
        super(tcpServerIO);
    }

    @Override
    public void action() {
        System.out.println("Количество сообщений");
    }
}
