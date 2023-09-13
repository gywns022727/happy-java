package org.example;

public class MathBeanTest {
    public static void main(String[] args) {
        MathBean math = new MathBean();

        math.printClassName();
        math.printNumber(1);
        math.getOne();
        math.plus(1, 2);
    }
}
