package ru.itmo.homeworks.hw17;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class AdditionalTask {
    public static void main(String[] args) {

        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout the point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

        // TODO: Используя Stream API: создать Map<String, Long>, где
        //      String - слово
        //      Long - частота встречаемости
        //  В мапу должны войти только первые 10 по частоте встречаемости слов.

        Map<String, Long> map = Arrays.stream(text.split(" "))
                .parallel()
                .map(word -> word.toLowerCase().trim()) // собираем в map: слово - количество
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet() //
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // собираем мапу

        System.out.println(map);
    }
}
