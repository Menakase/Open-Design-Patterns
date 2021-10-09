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
public class GlassHouse extends House{

    @Override
    public void buildiingPillars() {
        System.out.println("Building glass pillars");
    }

    @Override
    public void buildiingWalls() {
        System.out.println("Building glass walls");
    }
    
}
