/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author NanoX
 */
public class TemplateMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        House newGlassHouse = new GlassHouse();
        newGlassHouse.buidlHouse();
        
        System.out.println("*******************************");
        
        House newWoodenHouse = new WoodenHouse();
        newWoodenHouse.buidlHouse();
    }
    
}
