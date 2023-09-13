package org.example.util;

public class Calculator {
    public int plus(int x, int y){
        return x + y;
    }
    public int minus(int x, int y){
        return x - y;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int value1 = cal.plus(1, 2);
        int value2 = cal.minus(1, 2);

        System.out.println(value1 + "," + value2);
    }
}
