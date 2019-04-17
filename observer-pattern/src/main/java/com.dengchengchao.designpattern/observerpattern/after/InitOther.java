package com.dengchengchao.designpattern.observerpattern.after;

import org.omg.CORBA.Object;

/**
 * @author dengchengchao
 * @date 2019/4/17 10:54
 */
public class InitOther implements Observer {

    @Override
    public void update(LifeCycle lifeCycle) {
         if (lifeCycle==LifeCycle.INIT){
             System.out.println("初始化 一");
         }
    }
}
