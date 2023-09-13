package org.example;

// 1~45까지 써있는 Ball을 로또 기계에 넣는다.
// 로또 기계에 있는 Ball을 섰는다.
// 섞인 Ball중에 6개를 꺼낸다.
public interface LottoMachine {
    int MAX_BALL_COUNT =  45;
    int RETURN_BALL_COUNT = 6;
    public void setBalls(Ball[] balls); // Ball[] Ball 여러개를 받겠다.
    public void mix(); //Ball을 섞는다.
    public  Ball[] getBalls();
}
