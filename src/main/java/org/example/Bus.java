package org.example;

// Bus는 자동차의 한 종류이다.
public class Bus extends Car{
    @Override
    public void run() {
        System.out.println("run run");
    }

    public void stop(){
        System.out.println("stop");
    }

}
