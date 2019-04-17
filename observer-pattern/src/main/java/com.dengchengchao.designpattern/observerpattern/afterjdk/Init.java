package com.dengchengchao.designpattern.observerpattern.afterjdk;

import com.dengchengchao.designpattern.observerpattern.after.LifeCycle;

import java.util.Observable;
import java.util.Observer;

/**
 * @author dengchengchao
 * @date 2019/4/17 11:27
 */
public class Init implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (arg == LifeCycle.INIT) {
            System.out.println("初始化 二");
        }
    }

    public static void main(String[] args) {
        XXSystem xxSystem=new XXSystem();
        Init init=new Init();
        xxSystem.addObserver(init);
        xxSystem.init();

    }
}
