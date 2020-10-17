/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorpattern;

/**
 *
 * @author NanoX
 */
interface Router {
    public void sendData(char[] data);
    public void acceptData(char[] data);
    public void accept(RouterVisitor visitor);
    
}
