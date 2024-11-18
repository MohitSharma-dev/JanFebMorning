package DesignPatterns.Factory.UIComponents.Button;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("Clicked AndroidButton");
    }
}
