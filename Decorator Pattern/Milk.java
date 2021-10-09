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
public class Milk extends BeverageDecorator{
    
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "Milk";
    }
    
    
    
}
