/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operation;

import object.Circle;
import object.Rectangle;
import object.Shape;
import object.Triangle;

/**
 *
 * @author Admin
 */
public class Menu {

    Shape rectange = new Rectangle();
    Shape circle = new Circle();
    Shape triangle = new Triangle();

    public void inputProgram() {
        rectange.input();
        circle.input();
        triangle.input();
    }

    public void display() {
        rectange.printResult();
        circle.printResult();
        triangle.printResult();
    }
}
