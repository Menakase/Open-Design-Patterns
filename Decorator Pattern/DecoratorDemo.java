/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author NanoX
 */
public class DecoratorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage milkCoffee = new Suger(new Milk(new Coffee(new PlainBeverage())));
        Beverage milk = new Suger(new Milk(new PlainBeverage()));
        
        
        Beverage coffee = new Coffee(new PlainBeverage());
        coffee = new Suger(coffee);
        
        System.out.println(milkCoffee.getCost() + " " + milkCoffee.getDesc());
        System.out.println(milk.getCost() + " " + milk.getDesc());
        System.out.println(coffee.getCost() + " " + coffee.getDesc());
    }
    
}
