package ru.itmo.homeworks.hw21;

public class HelpCommand extends Command {
    public HelpCommand(TCPServerIO tcpServerIO) {
        super(tcpServerIO);
    }

    @Override
    public void action() {
        System.out.println("Список доступных команд");
    }
}