package DesignPatterns.Factory.UIComponents.Button;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("Clicked IOS Button");
    }
}
