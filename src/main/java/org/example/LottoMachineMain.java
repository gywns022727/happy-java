package org.example;

public class LottoMachineMain {
    public static void main(String[] args) {
        // 변수가 45개 필요하다. Ball 인스턴스를 45개 참조할 수 있는 배열을 만들자
        Ball[] balls = new Ball[45];
        for(int i = 0; i < 45; i++) {
            balls[i] = new Ball(i + 1);
        }

        // LottoMachine 인스텉스가 생성된다.
        LottoMachine lottomachine = new LottoMachineImpl();
        lottomachine.setBalls(balls);
        lottomachine.mix();
        Ball[] result = lottomachine.getBalls();

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i].getNumber());
        }

    }
}
