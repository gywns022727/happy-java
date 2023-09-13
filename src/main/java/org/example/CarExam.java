package org.example;

public class CarExam {
    public static void main(String[] args) {
        Car c1 = new Car(){
            @Override
            public void run() {
                System.out.println("이름 없는 객체");
            }
        };
        c1.run();
    }
}
