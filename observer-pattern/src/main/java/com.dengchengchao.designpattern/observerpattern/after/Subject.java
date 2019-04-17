package com.dengchengchao.designpattern.observerpattern.after;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengchengchao
 * @date 2019/4/17 10:47
 */
public abstract class Subject {

    private List<Observer> observers=new ArrayList<>();


    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(LifeCycle lifeCycle){
        for (Observer observer : observers) {
            observer.update(lifeCycle);
        }
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }
}
