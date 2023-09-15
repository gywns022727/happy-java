package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception {
        // 키보드로부터 한 줄씩 입력 받고, 한 줄씩 화면에 출력하시오.
        // 키보드 : System.in
        // 화면에 출력 : System.out
        // 키보드로 입력 받는 다는건 문자를 입력 받는 것 : char 단위 입출력
        // 한줄 읽기 : BufferedReader라는 클래스는 readLine이라는 메소드를 가지고 있다.
        // 더이상읽을게 없으면 null을 반환
        // 한줄 쓰기 : PrintStream, PrintWriter

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        br.readLine(); // 한줄 입력 받는다.
        while((line = br.readLine()) != null){
            System.out.println("읽어들인 값 : " + line);

        }

    }
}
