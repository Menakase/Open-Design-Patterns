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
public class BridgeDesignPatternDemo {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        Television samsungTV = new SamsungTelevision();
        
        RemoteControl remoteControl = new RemoteControl(samsungTV);
        remoteControl.turnOn();
        
        AdvancedRemoteControll advancedRemoteControll = new AdvancedRemoteControll(samsungTV);
        advancedRemoteControll.switchChannel(2);
        
    }
    
}
