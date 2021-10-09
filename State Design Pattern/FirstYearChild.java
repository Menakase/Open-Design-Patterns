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
public class FirstYearChild extends ChildState{
    private Child child;
    public FirstYearChild(Child child) {
        super(child);
        this.child = child;
    }

    @Override
    public void play() {
        System.out.println("Child play with mother");
    }

    @Override
    public void eat() {
        System.out.println("Child eats milk");
    }
    
}
