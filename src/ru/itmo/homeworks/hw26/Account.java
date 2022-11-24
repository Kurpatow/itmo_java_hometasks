package ru.itmo.homeworks.hw26;

public class Account {
    private int id; // unique
    private int balance; //доступные средства на счете

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }
    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getBalance() {return balance;}

    public void setBalance(int balance) {this.balance = balance;}
}
