package org.example;

public class Book {
    private int price;

    // 필드의 값을 수정하고 얻기 위한 메소드를 만든다. getter, setter
    public int getPrice(){
        return this.price;
    }

    public int setPrice(int price){
        return this.price = price;
    }
}
