/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypattern;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author NanoX
 */
public class ProxyInternet implements Internet{
    private RealInternet internet = new RealInternet();
    public static List<String> blockedList = new ArrayList<>();
    
    static{
        blockedList.add("facebook.com");
    }
    
    @Override
    public void connect(String host) {
        if(blockedList.contains(host.toLowerCase())){
            System.out.println("Access blocked to " + host);
        }else{
            internet.connect(host);
        }
    }
    
}
