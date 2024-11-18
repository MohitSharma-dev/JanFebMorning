package DesignPatterns.Factory;

import DesignPatterns.Factory.UIComponents.Button.Button;
import DesignPatterns.Factory.UIComponents.Dropdown.Dropdown;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
}
