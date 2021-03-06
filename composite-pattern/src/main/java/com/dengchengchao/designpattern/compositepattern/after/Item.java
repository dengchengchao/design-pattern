package com.dengchengchao.designpattern.compositepattern.after;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengchengchao
 * @date 2019/12/9 20:18
 */
public class Item implements Control {

    private List<Control> children = new ArrayList<>();

    private int level;

    @Override
    public void save() {
        System.out.println("- - - Item");
        for (Control control : children) {
            control.save();
        }
    }

    @Override
    public void add(Control control) {
        control.setLevel(3);
        children.add(control);
    }

    @Override
    public void remove(Control control) {
        children.remove(control);
    }

    @Override
    public void setLevel(int level) {
        this.level=level;
    }
}
