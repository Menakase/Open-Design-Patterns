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
public abstract class House {
    
    public void buildiingFundation(){
        System.out.println("Buidling the foundation.");
    }
    
    public abstract void buildiingPillars();
    public abstract void buildiingWalls();
    
    public void buildiingWindows(){
        System.out.println("Buidling the windows.");
    }
    
    public void buidlHouse(){
        buildiingFundation();
        buildiingPillars();
        buildiingWalls();
        buildiingWindows();
        System.out.println("House Completed!");
    }
    
}
