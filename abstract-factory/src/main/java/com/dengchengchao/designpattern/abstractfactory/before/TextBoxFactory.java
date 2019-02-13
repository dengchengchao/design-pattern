package com.dengchengchao.designpattern.abstractfactory.before;

import com.dengchengchao.designpattern.abstractfactory.before.conf.SkinConf;
import com.dengchengchao.designpattern.abstractfactory.before.impl.BlueTextBox;
import com.dengchengchao.designpattern.abstractfactory.before.impl.GreenTextBox;

/**
 * @author dengchengchao
 * @date 2019/2/13 14:41
 */
public class TextBoxFactory {

    public static TextBox createTextBox() {
        switch (SkinConf.COLOR) {
            case "Green":
                return new GreenTextBox();
            case "Blue":
                return new BlueTextBox();
            default:
                throw new UnsupportedOperationException("没有此皮肤");
        }
    }
}
