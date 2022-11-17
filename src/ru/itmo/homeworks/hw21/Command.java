package ru.itmo.homeworks.hw21;

abstract public class Command {
    private TCPServerIO tcpServerIO;
    public Command(TCPServerIO tcpServerIO){
        this.tcpServerIO = tcpServerIO;
    }
    abstract void action();


    public static Command getCommand(String str, TCPServerIO server) {
        Command command = null;
        if (str.equals("/help")) {
            command = new HelpCommand(server);
        } else {
            command = new CountCommand(server);
        }
        return command;
    }
}