package statedesignpattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NanoX
 */
public class ThirdYearChild extends ChildState{
    private Child child;
    public ThirdYearChild(Child child) {
        super(child);
        this.child = child;
    }

    @Override
    public void play() {
        System.out.println("Child play with sibilings");
    }

    @Override
    public void eat() {
        System.out.println("Child eats fruits");
    }
    
}
