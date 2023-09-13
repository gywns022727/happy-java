package org.example;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "홍길동";
        p1.address = "서울";
        p1.isVip = true;
        
        p2.name = "김놀부";
        p2.address = "인천";

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.address.length());
        System.out.println(p1.isVip);
        System.out.println("----------------------");
        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.address.length());
        System.out.println(p2.isVip);
    }
}
