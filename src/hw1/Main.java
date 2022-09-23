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
    }
}
