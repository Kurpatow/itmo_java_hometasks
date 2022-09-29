package hw3;

public class Task4 {
    public static void main(String[] args) {
        int user = 9;
        int ii = (int) ((Math.random() * 9) + 1);
        if (user > 9) {
            System.out.println("Число выходит за диапазон");
        }else if (user == ii) {
            System.out.println("Вы угадали! Это число " + ii );
        }else if (user > ii) {
            System.out.println("Загаданное число меньше. Я загадал " + ii);
        }else if (user < ii){
            System.out.println("Загаданное число больше. Я загадал " + ii);
        }else if (user == 0){
            System.out.println("Выход из программы");
        }
    }
}
