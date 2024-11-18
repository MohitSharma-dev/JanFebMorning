package DesignPatterns.Factory.UIComponents.Dropdown;

public class IOSDropdown implements Dropdown{
    @Override
    public void show() {
        System.out.println("Showing IOS dropdown");
    }
}
