package ru.itmo.homeworks.hw17.transactions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransactionsTask {
    public static void main(String[] args) {

        Account account1 = new Account("781057000", 2000);
        Account account2 = new Account("445259743", 1900);
        Account account3 = new Account("692343156", 30000);

        Transactions transaction1 = new Transactions("935b0b96-a93c-4ba3-b340-7e27918b77a1", 340, account1);
        Transactions transaction2 = new Transactions("6b724ed9-7718-4203-8e70-2728d09b7bf3", 560, account1);
        Transactions transaction3 = new Transactions("f0f44e9c-56cc-450e-bf92-3b0ff1497e49", 1000, account2);
        Transactions transaction4 = new Transactions("ffa44fa0-52c9-490d-aeee-d4d810cd37f0", 500, account2);
        Transactions transaction5 = new Transactions("5faef7f5-eca2-4a67-a228-fe4d8b59a2c8", 1600, account3);
        Transactions transaction6 = new Transactions("c38209a7-dbb7-47ee-b162-1953e29eab94", 2000, account3);
        Transactions transaction7 = new Transactions("c38209a7-dbb7-47ee-b162-1953e29eab94", 3400, account3);

        // дано:
        Stream<Transactions> transactionStream = Stream.of(transaction1, transaction2, transaction3,
                transaction4, transaction5, transaction6, transaction7);

        // TODO: Используя Stream API:
        //  1. собрать Map<String, Long>,
        //      где String - номер (number) аккаунта,
        //      Long - сумма транзакций (sum) по данному аккаунту
        //  2. найти сумму транзакций по всем аккаунтам


    }
}
