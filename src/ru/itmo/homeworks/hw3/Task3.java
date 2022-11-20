package ru.itmo.homeworks.hw3;

public class Task3 {
    public static void main(String[] args) {
        int t = 50; //грязные тарелки
        double ms = 10; //сколько у нас моющего средства
        double msr = 0.5; // расход на одну тарелку
        if (t < 0 || ms < 0){  //Колличество тарелок и средства положительное
        }else if (t == 0){
            System.out.println("Грязных тарелок нет");
        }else if (ms < msr){
            System.out.println("Не хватает моющего средства");
        }else{
            while (t > 0 && ms >= msr){
                t--;
                ms -= msr;
                System.out.println("Помыл тарелку. Средства осталось " + ms);
            }
            System.out.println("Посуда чистая");
            System.out.println("Грязных тарелок осталось " + t);
            System.out.println("Моющего средства осталось " + ms);
        }
    }
}
