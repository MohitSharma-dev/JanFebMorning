package DesignPatterns.Factory;

import DesignPatterns.Factory.UIComponents.Button.AndroidButton;
import DesignPatterns.Factory.UIComponents.Button.Button;
import DesignPatterns.Factory.UIComponents.Dropdown.AndroidDropdown;
import DesignPatterns.Factory.UIComponents.Dropdown.Dropdown;

public class AndroidUIFactory implements UIComponentFactory{

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
