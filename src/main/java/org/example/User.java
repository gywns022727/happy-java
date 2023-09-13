package org.example;

public class User {
    private String email;
    private String password;
    private String name;


    // 생성자를 하나라도 만들면 기본 생성자는 자동으로 만들어 지지 않는다
    public User(String name, String email) {
        this(name, email, null);
        // 파라미터가 많은 때 this 생성자를 사용한다 이 생성자는 첫 줄에 있어야 된다.
    }

    // 생성자 오버로딩
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
