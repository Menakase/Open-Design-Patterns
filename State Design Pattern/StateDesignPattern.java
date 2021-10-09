/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statedesignpattern;

/**
 *
 * @author NanoX
 */
public class StateDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Child childOne = new Child(1);
        childOne.makeChildPlay();
        childOne.makeChildEat();
        
        Child childTwo = new Child(2);
        childTwo.makeChildPlay();
        childTwo.makeChildEat();
        
        Child childThree = new Child(3);
        childThree.makeChildPlay();
        childThree.makeChildEat();
        
    }
    
}
