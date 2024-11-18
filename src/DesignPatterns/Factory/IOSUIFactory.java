package DesignPatterns.Factory;

import DesignPatterns.Factory.UIComponents.Button.Button;
import DesignPatterns.Factory.UIComponents.Button.IOSButton;
import DesignPatterns.Factory.UIComponents.Dropdown.Dropdown;
import DesignPatterns.Factory.UIComponents.Dropdown.IOSDropdown;

public class IOSUIFactory implements UIComponentFactory{
    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
