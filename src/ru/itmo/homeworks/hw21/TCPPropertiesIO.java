package ru.itmo.homeworks.hw21;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TCPPropertiesIO {
    private static final String CLIENT_PROPERTIES_PATH = "hw21_config.properties";

    private static final int PORT_BY_DEFAULT = 8090;

    private static final Properties clientProperties;

    static {
        clientProperties = setClientProperties();
    }

    private static Properties setClientProperties() {

        Properties properties = new Properties();

        try(InputStream input = TCPPropertiesIO.class.getClassLoader()
                .getResourceAsStream(TCPPropertiesIO.CLIENT_PROPERTIES_PATH)) {
            properties.load(input);
        } catch (IOException | NullPointerException e) {
            System.out.println("Проблемы с чтением " + TCPPropertiesIO.CLIENT_PROPERTIES_PATH);
        }
        return properties;
    }

    public static String getClientIP() {
        String clientIP = clientProperties.getProperty("ip");
        if (clientIP == null || clientIP.split("\\.").length != 4) {
            throw new IllegalArgumentException("Неверный формат IP клиента в файле " + CLIENT_PROPERTIES_PATH);
        }
        return clientIP;
    }

    public static int getClientPort() {
        return getTCPPortFromString(clientProperties.getProperty("port"));
    }

    public static int getTCPPortFromString(String tcpPort) {
        int clientPort = 0;
        try {
            clientPort = Integer.parseInt(tcpPort);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат значения port в файле " + CLIENT_PROPERTIES_PATH);
        }
        return checkTCPPort(clientPort);
    }

    private static int checkTCPPort(int port) {
        if (port < 1024 || port > 49151) {
            System.out.println("Ошибочное значение порта. Задано значение по умолчанию = 8090");
            return PORT_BY_DEFAULT;
        }
        return port;
    }
}