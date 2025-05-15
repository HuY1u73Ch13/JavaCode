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
        LinearSearch ln = new LinearSearch();
        
        //input number of array
        int sizeArray = ln.input("Enter number of array: ");
        //input search value
        int value = ln.input("Enter search value: ");
        //create array
        ln.createArray(sizeArray);
        //create random array
        ln.createRandomArray();
        //display array
        ln.display("The array: ");
        //search
        int index = LinearSearch.search(ln.getArray(), value);
        //display answer
        if(index == -1){
            System.out.println("Not Found !!!");
        }else {
            System.out.println("Found " + value + " at index: " + index);
        }
    }
}
