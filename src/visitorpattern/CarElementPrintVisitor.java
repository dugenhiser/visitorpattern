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
public class CarElementPrintVisitor implements ICarElementVisitor {
    public void visit(Wheel wheel) {      
        System.out.println("Visiting " + wheel.getName() + " wheel");
    }
 
    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }
 
    public void visit(Body body) {
        System.out.println("Visiting body");
    }
 
    public void visit(Car car) {      
        System.out.println("Visiting car");
    }
}
