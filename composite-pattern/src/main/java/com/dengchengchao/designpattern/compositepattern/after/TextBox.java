package com.dengchengchao.designpattern.compositepattern.after;

/**
 * @author dengchengchao
 * @date 2019/12/10 9:58
 */
public class TextBox implements Control {

    private int  level;

    @Override
    public void save() {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < level; i++) {
            stringBuilder.append('-').append(" ");
        }
        System.out.println(stringBuilder+"TextBox保存成功");
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
