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
public interface ICarElement {
    void accept(ICarElementVisitor visitor); // CarElements have to provide accept().
}
