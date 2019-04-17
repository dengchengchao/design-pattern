package com.dengchengchao.designpattern.observerpattern.after;

/**
 * @author dengchengchao
 * @date 2019/4/17 10:41
 */
public class XXSystem extends Subject {

    public void init() {
        notifyAllObservers(LifeCycle.INIT);
    }


    public void start() {
        notifyAllObservers(LifeCycle.START);
    }


    public void stop() {
        notifyAllObservers(LifeCycle.STOP);

    }

    public void destory() {
        notifyAllObservers(LifeCycle.DESTORY);
    }


    public static void main(String[] args) {
        XXSystem xxSystem=new XXSystem();
        Init init=new Init();
        InitOther initOther=new InitOther();
        xxSystem.attach(init);
        xxSystem.attach(initOther);
        xxSystem.init();
        xxSystem.start();
        xxSystem.stop();
        xxSystem.destory();
    }


}
