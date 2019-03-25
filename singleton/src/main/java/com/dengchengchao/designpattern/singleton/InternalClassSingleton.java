package com.dengchengchao.designpattern.singleton;


/**
 * @author dengchengchao
 * @date 2019/3/8 11:25
 */
public class InternalClassSingleton {

    public static InternalClassSingleton getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static InternalClassSingleton instance = new InternalClassSingleton();
    }

    private InternalClassSingleton(){

    }
}
