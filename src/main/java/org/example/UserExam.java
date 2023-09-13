package org.example;

public class UserExam {
    public static void main(String[] args) {
        User user = new User("nick", "nick@email.com");
        System.out.println(user.getName());
        System.out.println(user.getEmail());

        User user2 = new User("nick", "nick@email.com", "1234");
        System.out.println(user2.getName());
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());
        System.out.println(user2);
    }
}
