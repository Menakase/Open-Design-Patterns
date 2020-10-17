/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgedesignpattern;

/**
 *
 * @author NanoX
 */
public class SamsungTelevision implements Television{

    @Override
    public void turnOn() {
        System.out.println("Samsung TV On");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV Off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Samsung TV : Switch Channel"+channel);
    }
    
}
