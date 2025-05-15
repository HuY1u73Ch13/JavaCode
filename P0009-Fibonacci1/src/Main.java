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
        Fibonacci fibonacci = new Fibonacci();
        int method = fibonacci.input("Choose method (1 = Recursive, 2 = Array): ");
        int n = fibonacci.input("Enter the number of Fibonacci terms to display: ");
        boolean useRecursive;
        if(method == 1){
            useRecursive = true;
        }else {
            useRecursive = false;
        }
        fibonacci.display(n, useRecursive);
    }
}
