package DesignPatterns.Decorator.StarBuzz;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class StarBuzz {
    public static void main(String[] args) {
        Beverage b = new Decaf();

        b = new Mocha(b);
        b =  new Milk(b);

        b.getDesc();
        System.out.println();
        System.out.println(b.cost());
    }
}
