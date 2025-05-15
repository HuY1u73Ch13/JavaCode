/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        // chon method
        int method = fibo.input("Selec: ");
        // display
        boolean selec;
        if(method == 1){
            selec = true;
        }else {
            selec = false;
        }
        fibo.display(45,selec); 
    }
}
