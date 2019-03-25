package com.dengchengchao.designpattern.singleton;

/**
 * @author dengchengchao
 * @date 2019/3/8 10:50
 */
public class EagerlyInitializedSingleton {

    private static final EagerlyInitializedSingleton instance=new EagerlyInitializedSingleton();

    public static EagerlyInitializedSingleton getInstance(){
        return  instance;
    }

    private EagerlyInitializedSingleton(){}


}
