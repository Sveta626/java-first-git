package homworks1.homework1;

import java.util.Scanner;

public class Homwork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int a = scanner.nextInt();
        if (a == 1) {
            greetings();
        }
        if (a == 2) {
            checkSign(2, 6, 4);
        }
        if (a == 3) {
            selectColor();
        }
        if (a == 4) {
            compareNumbers();
        }
        if (a == 5) {
            addOrSubtractAndPrint(4, 8, true);
        }
        //  greetings();
        // checkSign(2, 6, 4);
        //  selectColor();
        //  compareNumbers();
        //  addOrSubtractAndPrint(4, 8, true);

    }

    public static void greetings() {
        System.out.println("Hello,");
        System.out.println("World,");
        System.out.println("from,");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int summa = a + b + c;
        if (summa >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 15;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}

