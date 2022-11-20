package ru.itmo.homeworks.hw04;

public class Main {
    public static void main(String[] args) {
        String cat = "Кот сидит в корзинке.";
        cat = cat.toLowerCase();


        //replaceAll(String regex, String replacemen
        //заменяет каждую подстроку данной строки, которая соответствует заданному регулярному выражению,
        //метод позволяет заменить слово в строке.
        // regex – регулярное выражение, которому данная строка должна соответствовать;
        // replacement – строка, которая заменит найденное выражение.

        cat = cat.replaceAll("Кот", "Кит");
        System.out.println(cat); // Кит
        cat = cat.replaceAll("сидит в корзинке","плывёт по морю.");
        System.out.println(cat); // Кит плывёт по морю
        cat = cat.replaceAll("Кит", "Кот");
        System.out.println(cat); // Кот плывёт по морю


        //replaceFirst(String regex, String replacement
        //заменяет первую подстроку данной строки, которая соответствует заданному регулярному выражению,
        //метод позволяет заменить первое вхождение слова или словосочетания в строке.
        // regex – регулярное выражение, которому данная строка должна соответствовать;
        // replacement – строка, которая заменит найденное выражение.

        String cat1 = "Кот и снова Кот";
        cat1 = cat1.replaceFirst("Кот", "Кит");
        System.out.println(cat1); //Кит и снова Кот

        //contains(CharSequence s), s - последовательность для поиска
        //Возвращает true тогда и только тогда, когда эта строка содержит указанную последовательность значений char.

        String cat2 = "Кругом Киты";
        if(cat2.contains("Коты")) System.out.println("Коты... они везде!!!");
        else System.out.println("Нет никаких котов, одни киты!");

        // startsWith(String prefix, int toffset)
        //prefix – префикс, который должен быть сопоставлен;
        //toffset – начальный индекс поиска в строке

        String cat4 = "Котов тут много";
        if(cat4.startsWith("Кот")) System.out.println("OK!");
        else System.out.println("NOOOOO!!!");

        //endsWith(String suffix)
        //Проверяет, заканчивается ли эта строка указанным суффиксом.

        String cat5 = " Cats are everywhere ";
        if(cat5.endsWith("everywhere ")) System.out.println("OK!");
        else System.out.println("A!");

        cat5 = cat5.trim(); /*Возвращает строку, значением которой является эта строка,
        с удаленными начальными и конечными пробелами,
        где пробел определяется как любой символ, чей код меньше или равен 'U+0020' (символ пробела).*/
        System.out.println(cat5);

        //strip() //Возвращает строку, значением которой является эта строка, с удаленными начальными и конечными пробелами.
        //stripIndent()Возвращает строку, значением которой является эта строка, с удалением случайных пробелов в начале и в конце каждой строки.
        //stripLeading()Возвращает строку, значением которой является эта строка, с удалением всех начальных пробелов.
        //stripTrailing()Возвращает строку, значением которой является эта строка, с удалением всех завершающих пробелов.

        String dog = "   DOG   ";
        dog = dog.strip();
        dog = dog.stripLeading();
        dog = dog.stripTrailing();
        System.out.println(dog);

        //compareTo(String anotherString) позволяет сравнить два числа одного типа
        // compareToIgnoreCase(String str) позволяет сравнить два числа одного типа без учета регистра
        String x = "5", y = "8";
        System.out.println(x.compareTo(y));




        //isBlank() true, если строка пуста или содержит только кодовые точки с пробелами, в противном случае — false.
        //isEmpty() Возвращает true тогда и только тогда, когда length() равно 0

        String dots = "dots";

        System.out.println((boolean) dots.isBlank());

        //repeat(int count)
        //Возвращает строку, значение которой является конкатенацией этой строки, повторенной количество раз

        String dog1 = "doG";
        dog1 = dog1.repeat(5);
        System.out.println(dog1);

        String s = "Я буду хорошим программистом!";
        char result1 = s.charAt(8);
        char result2 = s.charAt(11);
        System.out.println("Восьмой символ строки - " + result1);
        System.out.println("Одиннадцатый символ строки - " + result2);
    }
}

