package org.example;

public class StandardOutput {
    public void println(boolean b) {
        System.out.println(b);
    }
    public void println(int i) {
        System.out.println(i);
    }
    public void println(double d) {
        System.out.println(d);
    }
    public void println(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        StandardOutput outPut = new StandardOutput();

        outPut.println(10);
        outPut.println("hi");
        outPut.println(10.5);
        outPut.println(true);
    }
}
