package org.example;

public class Bus2 extends Car2{
    public Bus2() {
        super("Bus!!"); // 부모의 기본 생성자를 호출하는 코드가 자동으로 삽입된다.
        System.out.println("Bus2 기본 생성자");
    }

    // 부모가 가지고 있는 추상 메소드는 자식에서 구현 해줘야 된다.
    @Override
    public void run() {
        System.out.println("후륜");
    }
}
