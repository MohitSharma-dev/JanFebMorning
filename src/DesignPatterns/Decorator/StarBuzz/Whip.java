package DesignPatterns.Decorator.StarBuzz;

public class Whip extends AddOn{
    private Beverage beverage;

    Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void getDesc() {
        beverage.getDesc();
        System.out.print("Added Whip ");
    }

    @Override
    public double cost() {
        return 10 + beverage.cost();
    }
}
