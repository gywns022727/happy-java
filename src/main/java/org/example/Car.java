package org.example;

public class Car {
    private String name; // 필드는 가지는 것

    // 매개변수 0개인 기본 생성자라고 한다.
    // 생성자가 하나도 없으면 아무일도 안하는 기본 생성자가 자동으로 만들어진다.
    public Car(){
        System.out.println("Car!");
    }

    // 이름을 가지고 인스턴스가 만들어지게 하고 싶ㄷ.
    public Car(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("자동차 이름 : " + name);
    }

    @Override
    public String toString() {
        return "Car!!!";
    }

    public void run(){
        System.out.println("run");
    }
}
