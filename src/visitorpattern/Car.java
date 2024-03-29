/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorpattern;

/**
 *
 * @author Douglas
 */
public class Car implements ICarElement {
    ICarElement[] elements;
 
    public Car() {
        //create new Array of elements
        this.elements = new ICarElement[] { new Wheel("front left"),
            new Wheel("front right"), new Wheel("back left") ,
            new Wheel("back right"), new Body(), new Engine() };
    }
 
    public void accept(ICarElementVisitor visitor) {    
        for(ICarElement elem : elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);    
    }
}