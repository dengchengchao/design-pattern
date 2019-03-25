package com.dengchengchao.designpattern.singleton;

/**
 * @author dengchengchao
 * @date 2019/3/8 10:53
 */
public class LazilyBasicInitializedSingleton {

    private  static volatile LazilyBasicInitializedSingleton instance;

    private LazilyBasicInitializedSingleton() {
    }

    public static LazilyBasicInitializedSingleton getInstance() {
        if (instance == null) {
            synchronized (LazilyBasicInitializedSingleton.class) {
                if (instance == null) {
                    instance = new LazilyBasicInitializedSingleton();
                }
            }
        }
        return instance;
    }


}
