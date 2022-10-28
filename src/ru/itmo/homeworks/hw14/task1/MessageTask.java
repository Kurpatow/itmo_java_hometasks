package ru.itmo.homeworks.hw14.task1;
import ru.itmo.homeworks.hw11.SolarSystemPlanets;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
        System.out.println('\n');
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
        System.out.println('\n');
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
        System.out.println('\n');
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        System.out.println("Колличетсво уникальных сообщений");
        HashSet<Message> messageSet = new HashSet<>(messageList);
        System.out.println(messageSet.size());
        System.out.println('\n');
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        System.out.println('\n');
        System.out.println("Неповторяющиеся сообщения в порядке, в котором они встретились в первоначальном списке");
        LinkedHashSet<Message> linkedHashSet = new LinkedHashSet<>(messageList);
        LinkedList<Message> linkedList = new LinkedList<>(linkedHashSet);
        return linkedList;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println('\n');
        System.out.println("Удалить из коллекции каждое сообщение с заданным приоритетом");
        System.out.println("Коллекция до удаления сообщения с приоритетом: " + priority);
        System.out.println(messageList);
        Iterator<Message> iterator = messageList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPriority().equals(priority)) {
                iterator.remove();
            }
        }
        System.out.println("Коллекция после удаления сообщения с приоритетом: " + priority);
        System.out.println(messageList);
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println('\n');
        System.out.println("Удалить из коллекции каждое сообщение с заданным приоритетом");
        System.out.println("Коллекция до удаления сообщения с приоритетом: " + priority);
        System.out.println(messageList);
        Iterator<Message> iterator = messageList.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().getPriority().equals(priority)) {
                iterator.remove();
            }
        }
        System.out.println("Коллекция после удаления сообщения с приоритетом: " + priority);
        System.out.println(messageList);
    }

    public static void main(String[] args) {
        List<Message> messages = Message.generate(34);
        System.out.println(messages);
        MessageTask.countEachPriority(messages);
        MessageTask.countEachCode(messages);
        MessageTask.uniqueMessageCount(messages);
        System.out.println(MessageTask.uniqueMessagesInOriginalOrder(messages));
        MessageTask.removeEach(messages, MessagePriority.HIGH);
        MessageTask.removeOther(messages, MessagePriority.LOW);
    }
}