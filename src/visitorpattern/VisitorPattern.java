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
public class VisitorPattern {

    /**
     * @param args the command line arguments
     */
    
    /*********************************************************
     * 
     * All Code is from wikipedia.
     */
    public static void main(String[] args) {
         ICarElement car = new Car();
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
    
}
