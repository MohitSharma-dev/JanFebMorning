package DesignPatterns.Factory;

import DesignPatterns.Factory.UIComponents.Button.Button;
import DesignPatterns.Factory.UIComponents.Button.IOSButton;
import DesignPatterns.Factory.UIComponents.Dropdown.Dropdown;
import DesignPatterns.Factory.UIComponents.Dropdown.IOSDropdown;

public class IOS extends Platform{
    @Override
    public void setRefreshRate() {

    }

    @Override
    UIComponentFactory createUIComponentFactory() {
        return new IOSUIFactory();
    }
}
