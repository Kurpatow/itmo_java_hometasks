package hw5;

public class Main {
    public static void main(String[] args) {
        //Задание №1
        int[] nam = new int[4];
        for (int i = 0; i < nam.length; i++) {
            nam[i] = (int) (Math.random() * 9);
            System.out.println(nam[i]);
        }
        int max = nam[0];
        int min = nam[0];
        int sArf = 0;
        int i;
        for (i = 0; i < nam.length; i++) {
            if (max < nam[i]) {
                max = nam[i];
            }
            if (min > nam[i]){
                min = nam[i];
            }
        }
        for (int b : nam){
            sArf += b;
        }
        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);
        System.out.println("Среднее арефмитическое " + sArf / nam.length);

        //Задание №2
        int[] num = new int[10];
        for (int j = 0, b = 2; j < num.length; b += 2, j++) {
            num[j] = b;
        }
        for (int j = num.length - 1; j >= 0; j--) {
            System.out.println(num[j]);
        }
        //Задание №3
        //Задание №4
        String text = "В предложении все слова разной длины";
        String[] wordsArray = text.split(" ");
        int wordSize = 0;
        String longest = "";
        for (String word: wordsArray) {
            if (word.length() > wordSize) {
                wordSize = word.length();
                longest = word;
            }
        }
        System.out.println(String.format("Дано - " + text + "\n" + "Самое длинное слово - %s (количество символов = %d)", longest, wordSize));
        //Задание №5
    }
}
