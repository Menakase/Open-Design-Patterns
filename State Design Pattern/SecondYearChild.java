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
public class SecondYearChild extends ChildState{
    private Child child;
    public SecondYearChild(Child child) {
        super(child);
        this.child = child;
    }

    @Override
    public void play() {
        System.out.println("Child play with toys");
    }

    @Override
    public void eat() {
        System.out.println("Child eats biscuits");
    }
    
}
