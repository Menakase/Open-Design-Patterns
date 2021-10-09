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
public class PlainBeverage implements Beverage{

    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getDesc() {
        return "Plain Beverage";
    }
    
}
