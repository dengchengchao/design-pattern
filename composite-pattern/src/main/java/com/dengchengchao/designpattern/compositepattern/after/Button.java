package com.dengchengchao.designpattern.compositepattern.after;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengchengchao
 * @date 2019/12/9 20:19
 */
public class Button implements  Control {

    private int level;

    @Override
    public void save() {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < level; i++) {
            stringBuilder.append('-').append(" ");
        }
        System.out.println(stringBuilder+" Button保存成功");
    }

    @Override
    public void add(Control control) {
        System.out.println("错误的操作，不支持add()");
    }

    @Override
    public void remove(Control control) {
        System.out.println("错误的操作，不支持remove()");
    }

    @Override
    public void setLevel(int level) {
        this.level=level;
    }
}
