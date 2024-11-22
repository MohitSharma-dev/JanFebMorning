package DesignPatterns.Decorator.StarBuzz;

public class Mocha extends AddOn{
    private Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void getDesc() {
        beverage.getDesc();
        System.out.print("Added Mocha ");
    }

    @Override
    public double cost() {
        return 10 + beverage.cost();
    }
}
