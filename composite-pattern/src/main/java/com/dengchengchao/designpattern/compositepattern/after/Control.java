package com.dengchengchao.designpattern.compositepattern.after;

/**
 * @author dengchengchao
 * @date 2019/12/9 20:14
 */
public interface Control {

    void add(Control control);

    void remove(Control control);

    void setLevel(int level);

    void save();
}
