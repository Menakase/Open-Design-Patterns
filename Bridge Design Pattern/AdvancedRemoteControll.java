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
public class AdvancedRemoteControll extends RemoteControl{
    public AdvancedRemoteControll(Television television){
        super(television);
    }
    
    public  void switchChannel(int channel){
        television.switchChannel(channel);
    }
}
