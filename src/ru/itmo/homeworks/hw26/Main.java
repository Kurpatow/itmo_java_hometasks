package ru.itmo.homeworks.hw26;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account account01 = new Account(2171, 219_000);
        Account account02 = new Account(1348,102_000);
        Account account03 = new Account(9978, 54_000);
        Account account04 = new Account(4288, 334_000);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account01);
        accounts.add(account02);
        accounts.add(account03);
        accounts.add(account04);

        Bank tink = new Bank();

        int mark1, mark2, sum;
        for (int i = 0; i < 8; i++) {
            mark1 = (int) (Math.random() * 4);
            sum = (int) (Math.random() * 90_000);

            if (mark1 > 0) mark2 = mark1 - 1;
            else mark2 = mark1 + 1;
            System.out.println((i + 1) + ". Перевод со счета клиента № " + accounts.get(mark1).getId() +
                    " на счет клиента № " + accounts.get(mark2).getId() + " на сумму: " + sum);

            tink.transferMoney(accounts.get(mark1), accounts.get(mark2), sum);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }

        System.out.println("Итог балансов:");
        System.out.println("Баланс счёта № " + account01.getId() + " равен: " + account01.getBalance());
        System.out.println("Баланс счёта № " + account02.getId() + " равен: " + account02.getBalance());
        System.out.println("Баланс счёта № " + account03.getId() + " равен: " + account03.getBalance());
        System.out.println("Баланс счёта № " + account04.getId() + " равен: " + account04.getBalance());
    }
}
