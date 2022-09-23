package hw1;

public class Main {
    public static void main(String[] args) {
        //Задание №1
        int length = 5, width = 10, height = 5;
        System.out.println("Площадь равна " + length * width * height);
        //Задание №2
        int number = 9;
        System.out.println("Куб числа " + number + " равен " + number * number * number);
        //Задание №3
        double time = 7;
        double distance = 600;
        double mc = (distance / time) / 3.6;
        System.out.println("Итого метров секунду " + mc);
        //Задание №4
        //под задание №1
        int h = 45;
        int j = h % 10;
        int k = h / 10;
        System.out.println("Сумма цифр для числа " + h + " равна " + (j + k));
        //под задание №2
        int u = 11;
        int i = u % 10;
        int o = u / 10;
        System.out.println("Сумма цифр для числа " + u + " равна " + (i + o));
    }
}
