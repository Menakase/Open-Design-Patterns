/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypattern;

/**
 *
 * @author NanoX
 */
public class RealInternet implements Internet{

    @Override
    public void connect(String host) {
        System.out.println("Connected to " + host);
    }
    
}

