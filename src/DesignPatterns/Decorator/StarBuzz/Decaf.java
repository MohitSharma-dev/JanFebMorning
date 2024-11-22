package DesignPatterns.Decorator.StarBuzz;

public class Decaf extends Beverage{

    @Override
    public double cost() {
        return 200;
    }

    @Override
    public void getDesc() {
        System.out.print("Decaf ");
    }
}
