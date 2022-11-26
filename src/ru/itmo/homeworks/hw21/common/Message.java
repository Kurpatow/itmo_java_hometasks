package ru.itmo.homeworks.hw21.common;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {
    private String sender;
    private String text;
    private LocalDateTime dateTime;

    public Message(String sender, String text, LocalDateTime dateTime) {
        this.sender = sender;
        this.text = text;
        this.dateTime = dateTime;
    }
    public String getSender() {return sender;}

    public void setSender(String sender) {this.sender = sender;}

    public String getText() {return text;}

    public void setText(String text) {this.text = text;}

    public void setDateTime() {dateTime = LocalDateTime.now();}

    public LocalDateTime getDateTime() {return dateTime;}

    @Override
    public String toString() {
        return "SimpleMessage{" +
                "sender='" + sender + '\'' +
                ", text='" + text + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }

}
