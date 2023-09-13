package org.example;

public class SportsCar extends Car {
    // 부모가 기본 생성자가 없기 떄문에 반드시 super()를 호출해야 한다.
    public SportsCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("사륜");
    }
}
