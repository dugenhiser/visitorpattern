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
public interface ICarElementVisitor {
   void visit(Wheel wheel);
   void visit(Engine engine);
   void visit(Body body);
   void visit(Car car);
}
