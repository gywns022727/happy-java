package org.example;

import org.example.enumtype.Day;

public class DaySwitchTest {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;

        switch (day){
            case SUNDAY :
                System.out.println("일요일 입니다.");
                break;
            case FRIDAY:
                System.out.println("금요일 입니다.");
            default :
                System.out.println("그 밖의 요일");
        }

    }
}
