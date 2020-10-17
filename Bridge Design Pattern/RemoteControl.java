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
public class RemoteControl {
    protected Television television;
    
    public  RemoteControl(Television television){
        this.television = television;
    }
    
    public void turnOn(){
        television.turnOn();
    }
    
    public void turnOff(){
        television.turnOff();
    }
}
