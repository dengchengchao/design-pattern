package com.dengchengchao.designpattern.observerpattern.before;

/**
 * @author dengchengchao
 * @date 2019/4/17 10:24
 */
public class XXSystem {

    public void init() {

        System.out.println("初始化 一 。。。");

        System.out.println("初始化 二 。。。");

        System.out.println("初始化 三 。。。");
    }


    public void start() {

        System.out.println("启动 一 。。。");

        System.out.println("启动 二 。。。");

        System.out.println("启动 三 。。。");
    }


    public void stop() {

        System.out.println("关闭 一 。。。");

        System.out.println("关闭 二 。。。");

        System.out.println("关闭 三 。。。");
    }

    public void destory() {

        System.out.println("销毁 一 。。。");

        System.out.println("销毁 二 。。。");

        System.out.println("销毁 三 。。。");
    }


    public static void main(String[] args) {
        XXSystem xxSystem=new XXSystem();
        xxSystem.init();
        xxSystem.start();
        xxSystem.stop();
        xxSystem.destory();
    }
}
