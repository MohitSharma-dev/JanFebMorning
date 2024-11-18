package DesignPatterns.Factory;

import DesignPatterns.Factory.UIComponents.Button.AndroidButton;
import DesignPatterns.Factory.UIComponents.Button.Button;
import DesignPatterns.Factory.UIComponents.Dropdown.AndroidDropdown;
import DesignPatterns.Factory.UIComponents.Dropdown.Dropdown;

public class Android extends Platform{
    @Override
    public void setRefreshRate() {

    }

    @Override
    UIComponentFactory createUIComponentFactory() {
        return new AndroidUIFactory();
    }
}
