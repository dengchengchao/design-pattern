package com.dengchengchao.designpattern.observerpattern.after;

/**
 * @author dengchengchao
 * @date 2019/4/17 10:55
 */
public class Init implements Observer {

    @Override
    public void update(LifeCycle lifeCycle) {
        if (lifeCycle == LifeCycle.INIT) {
            System.out.println("初始化 二");
        }
    }
}
