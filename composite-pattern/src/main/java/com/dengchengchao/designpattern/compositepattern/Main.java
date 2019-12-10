package com.dengchengchao.designpattern.compositepattern;

import com.dengchengchao.designpattern.compositepattern.after.*;

/**
 * @author dengchengchao
 * @date 2019/12/9 19:39
 */
public class Main {




    public static void main(String[] args) {
        Page page=new Page();
        Group group=new Group();
        Item item =new Item();
        Button button=new Button();
        TextBox textBox=new TextBox();


        page.add(group);
        group.add(button);
        group.add(item);
        item.add(textBox);

        page.save();

    }
}
