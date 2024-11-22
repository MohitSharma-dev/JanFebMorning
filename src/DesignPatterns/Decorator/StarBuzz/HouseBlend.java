package DesignPatterns.Decorator.StarBuzz;

public class HouseBlend extends Beverage{
    @Override
    public void getDesc() {
        System.out.print("HouseBlend ");
    }

    @Override
    public double cost() {
        return 150;
    }
}
