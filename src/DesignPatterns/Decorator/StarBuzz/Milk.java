package DesignPatterns.Decorator.StarBuzz;

public class Milk extends AddOn {
    private Beverage beverage;

    Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void getDesc() {
        beverage.getDesc();
        System.out.print("Added Milk ");
    }

    @Override
    public double cost() {
        return 10 + beverage.cost();
    }
}
