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
public abstract class ChildState {
    
    Child child;
    
    public ChildState(Child child) {
        this.child = child;
    }
    public abstract void play();
    public abstract void eat();
}
