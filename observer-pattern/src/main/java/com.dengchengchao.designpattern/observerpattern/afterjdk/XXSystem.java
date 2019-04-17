package com.dengchengchao.designpattern.observerpattern.afterjdk;

import com.dengchengchao.designpattern.observerpattern.after.LifeCycle;

import java.util.Observable;

/**
 * @author dengchengchao
 * @date 2019/4/17 11:24
 */
public class XXSystem extends Observable {

    public void init() {
        this.setChanged();
        notifyObservers(LifeCycle.INIT);

    }


    public void start() {
        this.setChanged();
        notifyObservers(LifeCycle.INIT);

    }


    public void stop() {
        this.setChanged();
        notifyObservers(LifeCycle.INIT);


    }

    public void destory() {
        this.setChanged();
        notifyObservers(LifeCycle.INIT);

    }

}
