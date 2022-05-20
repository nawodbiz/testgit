package src;

import src.InputUtil;

public class Main {

    public static void main(String[] args) {

        int num1 = InputUtil.getInteger("Enter number 1");
        int num2 = InputUtil.getInteger("Enter number 2");
        int total = num1 + num2;
        int mul = num1 * num2;

        System.out.println("Total is: " + total);
        System.out.println("Product is: " + mul);

    }
}
