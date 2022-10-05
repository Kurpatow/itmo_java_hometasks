package hw5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание №1
        int[] nam = new int[4];
        int max = 300;
        int min = max;
        double sArf = 0;
        for (int i = 0; i < nam.length; i++) {
            nam[i] = (int) (Math.random() * max);
            System.out.println(nam[i]);
            if (max < nam[i]) {
                max = nam[i];
            }
            if (min > nam[i]) {
                 min = nam[i];
            }
            sArf = sArf + nam[i];
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
        int[] numArray = {18, -36, -11, 0, 99, 335, -4, 54, -13, 71, -897, -76};
        int negative = 0;
        for (int element : numArray ) {
            if (element < 0) negative++;
        }
        int[] allNegative = new int[negative];
        negative = 0;
        for (int element : numArray){
            if (element < 0) allNegative[negative++] = element;
        }
        System.out.println("Отрицательные элименты из исходного массива - " + Arrays.toString(allNegative));
    }
}