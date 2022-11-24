package ru.itmo.homeworks.hw26;

public class Transaction implements Runnable {
    private Account src; // с какого аккаунта осуществлять перевод
    private Account dst; // на какой аккаунт осуществлять перевод
    private int money; //сколько переводить

    public Transaction(Account src, Account dst, int money) {
        this.src = src;
        this.dst = dst;
        this.money = money;
    }
    private synchronized boolean getTransferSrcMoney() {
        if (src.getBalance() < money) {
            System.out.println("Ошибка транзакции! Сумма: " + money + " не списана со счета! " + "Баланс счёта № " + src.getId() + " равен: " + src.getBalance());
            return false;
        }
        int writeOff = src.getBalance() - money;
        src.setBalance(writeOff);
        System.out.println("Транзакция прошла успешно! Сумма: " + money + " списана со счета! " + "Баланс счёта № " + src.getId() + " равен: " + src.getBalance());
        return true;
    }
    private synchronized void receiptOfFundsDstMoney() {
        int receiptOfFunds = dst.getBalance() + money;
        dst.setBalance(receiptOfFunds);
        System.out.println("Поступление денежных средств на счёт № " + dst.getId() + " на сумму: " + money + " Баланс: " + dst.getBalance());
    }

    @Override
    public void run() {
        // TODO перевод денежных средств со счета src на счет dst в количестве money
        if (getTransferSrcMoney()) receiptOfFundsDstMoney();
    }
}
