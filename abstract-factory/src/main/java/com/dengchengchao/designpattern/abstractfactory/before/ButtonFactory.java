package com.dengchengchao.designpattern.abstractfactory.before;

import com.dengchengchao.designpattern.abstractfactory.before.conf.SkinConf;
import com.dengchengchao.designpattern.abstractfactory.before.impl.BlueButton;
import com.dengchengchao.designpattern.abstractfactory.before.impl.BlueTextBox;
import com.dengchengchao.designpattern.abstractfactory.before.impl.GreenButton;
import com.dengchengchao.designpattern.abstractfactory.before.impl.GreenTextBox;
import javafx.scene.control.Skin;

/**
 * @author dengchengchao
 * @date 2019/2/13 14:44
 */
public class ButtonFactory {

    public static Button createButton() {
        switch (SkinConf.COLOR) {
            case "Green":
                return new GreenButton();
            case "Blue":
                return new BlueButton();
            default:
                throw new UnsupportedOperationException("没有此皮肤");
        }
    }
}
