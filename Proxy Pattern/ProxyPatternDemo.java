/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypattern;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author NanoX
 */
public class ProxyPatternDemo {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        
        Internet internet = new ProxyInternet();
        internet.connect("google.lk");
        internet.connect("facebook.com");
        
    }
    
}
