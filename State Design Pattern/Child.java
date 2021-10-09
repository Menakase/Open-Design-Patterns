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
public class Child {

    private int age;

    private ChildState childState;

    public Child(int age) {
        this.age = age;
        setChildAge();
    }

    private void setChildAge() {
        if (age == 1) {
            childState = new FirstYearChild(this);
        } else if (age == 2) {
            childState = new SecondYearChild(this);
        } else {
            childState = new ThirdYearChild(this);
        }
    }

    public void makeChildPlay() {
        childState.play();
    }

    public void makeChildEat() {
        childState.eat();
    }

}
