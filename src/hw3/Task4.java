package hw3;

public class Task4 {
    public static void main(String[] args) {
        int ii;
        int user = 11;
        ii = (int) ((Math.random() * 8) + 1);
        if (user == ii) {
            System.out.println("Вы угадали! Я загадал число " + ii);
        } else {
            if (user > 0 && user <= 9) {
                System.out.println("Вы не угадали:( ");
                if (ii < user) {
                    System.out.println("Мое число меньше");
                } else {
                    System.out.println("Мое число больше");
                    }
            } else {
                System.out.println("Число вышло за рамки отрезка");
            }
        }
    }
}
