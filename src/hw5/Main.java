package hw5;

public class Main {
    public static void main(String[] args) {
       //Задание №1
        int[] num = new int[10];
        for (int i = 0, b = 2; i < num.length; b = b + 2, i++){
            num[i] = b;
        }
        for (int i = num.length - 1; i >= 0; i--){
            System.out.println(num[i]);
        }
    }
}
