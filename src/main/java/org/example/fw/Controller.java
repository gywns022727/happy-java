package org.example.fw;

public abstract class Controller {
    // protected는 같은 package이거나 상속 받았을 경우 접근 가능하다.
    // final이 붙으면 @override가 불가능 하다.
    protected final void init(){
        System.out.println("초기화");
    }
    protected final void close(){
        System.out.println("마무리 하는 코드");
    }
    protected abstract void run(); // 매번 다른 코드

    // 내가 가지고 있는 메소드를 호출한다.
    // 어떤 순서를 가지고 있단. 이런 메소드를 템플릿 메소드라고 한다.
    public void execute(){
        this.init();
        this.run();
        this.close();
    }
}
