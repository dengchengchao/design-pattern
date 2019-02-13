package com.dengchengchao.designpattern.abstractfactory.after;

import com.dengchengchao.designpattern.abstractfactory.before.TextBox;
import com.dengchengchao.designpattern.abstractfactory.before.Button;
import com.dengchengchao.designpattern.abstractfactory.before.impl.BlueButton;
import com.dengchengchao.designpattern.abstractfactory.before.impl.GreenButton;
import com.dengchengchao.designpattern.abstractfactory.before.impl.BlueTextBox;

/**
 * @author dengchengchao
 * @date 2019/2/13 11:16
 */
public class BlueFactory implements Factory{

    @Override
    public TextBox getTextBox(){
       return  new BlueTextBox();
    }

    @Override
    public Button getButton(){
        return  new BlueButton();
    }
}
