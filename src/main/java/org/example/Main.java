package org.example;

public class Main {
    public static void main(String[] args) {
        int num1 = Integer.MAX_VALUE;
        int num2 = 170;
        int result;

        result = num1 + num2;
        System.out.println("num1 + num2 = " + result);
        if (result > 200) {
            System.out.println("Результат больше 200");
        } else {
            System.out.println("Результат меньше или равен 200");
        }

        result = num1 - num2;
        System.out.println("num1 - num 2 = " + result);
        if (result < 0) {
            System.out.println("Результат отрицательный");
        } else if (result == 0) {
            System.out.println("Результат равен нулю");
        } else {
            System.out.println("Результат положительный");
        }

        result = num1 * num2;
        System.out.println("num1 * num 3 = " + result);
        switch (result) {
            case 0:
                System.out.println("Результат равен нулю");
                break;
            case 10000:
                System.out.println("Результат равен 10000");
                break;
            default:
                System.out.println("Результат не равен нулю или 10000");
                break;
        }

        result = num2 / num1;
        System.out.println("num2 / num1 = " + result);

        result = num2 % num1;
        System.out.println("num2 % num1 = " + result);

        boolean num3 = num2 > num1;
        System.out.println(num3);

        boolean num4 = num1 == num2;
        System.out.println(num4);

        boolean num5 = num1 != num2;
        System.out.println(num5);

        boolean num6 = num1 >= num2;
        System.out.println(num6);

        boolean num7 = num1 < num2 && num1 != 0;
        System.out.println(num7);

        double doubleResult = (double) num1 / num2;
        System.out.println("num1 / num2 (double) = " + doubleResult);

        doubleResult = num1 + (double) num2;
        System.out.println("num1 + num2 (double) = " + doubleResult);

        doubleResult = num1 * (double) num2;
        System.out.println("num1 * num2 (double) = " + doubleResult);
    }
}