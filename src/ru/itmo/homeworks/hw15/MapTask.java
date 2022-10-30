package ru.itmo.homeworks.hw15;

import java.util.*;

public class MapTask {

    // Задача № 1
    // TODO:: написать статический метод, который принимает на вход мапу (firstTaskMap) и город (city),
    //  формирует и возвращает список (List) логинов, которые соответствуют переданному городу
    public static ArrayList<String> cityLogin(HashMap<String, String> cityMap, String city) {
        ArrayList<String> cityLogin = new ArrayList<>();
        for (Map.Entry<String, String> pair : cityMap.entrySet()) {
            if (city.equals(pair.getValue())) {
            cityLogin.add(pair.getKey());
        }
    }
        return cityLogin;
}
    // Задача №2
    // TODO:: дан список слов (words).
    //  Написать статический метод, который будет возвращать количество одинаковых слов
    //  в мапе вида Map<String, Integer>, где String - слово и Integer - количество повторений
    public static HashMap<String, Integer> getCountDuplicates(List<String> words) {
        HashMap<String, Integer> countDuplicates = new HashMap<>();

        for (String word : words) {
            if (countDuplicates.containsKey(word)) {
                countDuplicates.put(String.valueOf(word), countDuplicates.get(word) + 1);
            }else {
                countDuplicates.put(String.valueOf(word), 1);
            }
        }
        return countDuplicates;
    }

    // Задача №3
    // TODO:: дана мапа (customerMap).
    //  Написать статический метод, который принимает на вход аргументы int from и int to и возвращает
    //  новую мапу, в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)
    public static HashMap<String, Customer> getCustomerAge(HashMap<String, Customer> customerMap, int ageFrom, int ageTo) {
        HashMap<String, Customer> customers = new HashMap<>();

        for (Map.Entry<String, Customer> couple : customerMap.entrySet()) {
            int customerAge = couple.getValue().getAge();
            if (customerAge >= ageFrom && customerAge <= ageTo) {
                customers.put(couple.getKey(), couple.getValue());
            }
        }
        return customers;
    }



    public static void main(String[] args) {
        // Задача № 1
        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";

        System.out.println("===== Задание №1 - Логины которые соответствуют городу =====");
        System.out.println(cityLogin(firstTaskMap, city));
        System.out.println('\n');


        // Задача № 2
        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        System.out.println("===== Задание №2 - Метод возвращает одинаковые слова и количество повторений =====");
        System.out.println(getCountDuplicates(words));
        System.out.println('\n');


        // Задача №3
        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));

        System.out.println("===== Задание №3 - Возвращаем новую мапу =====");
        System.out.println(getCustomerAge(customerMap, 23, 50));
        System.out.println('\n');


        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод (можно статический):
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  (Map<String, Long>, где - ключи (String) - слово, значения (Long) - частота встречаемости)
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  (Map<Integer, ArrayList<String>>, где - ключи (Integer) - количество букв, значения (ArrayList<String>) - слова)
        //  3. написать метод, который выводит в консоль топ 10 самых часто встречаемых в тексте слов (артикли и предлоги тоже считаем за слова)

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

    }
}
