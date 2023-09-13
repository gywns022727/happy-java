package org.example;

public class Child extends Parent{
    public int i = 15;

    @Override
    public void printI() {
        System.out.println("child = printI() : " + i);
    }
}
