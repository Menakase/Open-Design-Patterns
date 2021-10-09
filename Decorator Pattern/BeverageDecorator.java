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
public abstract class BeverageDecorator implements Beverage{
    public Beverage beverage;
    
    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String getDesc(){
        return this.beverage.getDesc();
    }

    @Override
    public int getCost(){
        return this.beverage.getCost();
    }

}
