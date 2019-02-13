package com.dengchengchao.designpattern.abstractfactory.after;

import com.dengchengchao.designpattern.abstractfactory.before.TextBox;
import com.dengchengchao.designpattern.abstractfactory.before.Button;


/**
 * @author dengchengchao
 * @date 2019/2/13 11:21
 */
public interface Factory {

     TextBox getTextBox();

     Button getButton();
}
