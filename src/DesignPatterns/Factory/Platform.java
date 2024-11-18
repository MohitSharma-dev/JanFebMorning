package DesignPatterns.Factory;

import DesignPatterns.Factory.UIComponents.Button.AndroidButton;
import DesignPatterns.Factory.UIComponents.Button.Button;
import DesignPatterns.Factory.UIComponents.Button.IOSButton;
import DesignPatterns.Factory.UIComponents.Dropdown.Dropdown;

import java.awt.*;

public abstract class Platform {
    abstract void setRefreshRate();

    abstract UIComponentFactory createUIComponentFactory();
//    abstract Button createButton();
////    abstract Menu createMenu();
//    abstract Dropdown createDropdown();


//    void createButton(){
//        Button button = null;
//        if(this instanceof Android){
//            button = new AndroidButton();
//        } else if (this instanceof IOS){
//            button = new IOSButton();
//        }
//    }
}
