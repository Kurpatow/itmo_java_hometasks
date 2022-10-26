package ru.itmo.homeworks.hw14.task1;
import java.util.HashSet;
import java.util.List;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
        int count;
        System.out.println("Количество сообщений для каждого приоритета");
        for (MessagePriority md : MessagePriority.values()){
            count = 0;
            for (Message message : messageList){
                if (md.equals(message.getPriority())){
                    count++;
                }
            }
            System.out.println("Приоритет: " + md + " Колличество сообщений: " + count);
        }
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        System.out.println("Количество сообщений для каждого кода сообщения");
        HashSet<Integer> massageSet = new HashSet<>();
        int count;
        for (Message massage : messageList) {
            massageSet.add(massage.getCode());
        }
        for (Integer code : massageSet) {
            count = 0;
            for (Message message : messageList) {
                if (code.equals(message.getCode())){
                    count ++;
                }
            }
            System.out.println("Код сообщения: " + code + " Колличество сообщений: " + count);
        }
    }

    public static void uniqueMessageCount(List<Message> messageList) {

        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return null;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
    }

    public static void main(String[] args) {
        List<Message> messages = Message.generate(34);
        System.out.println();
    }
}