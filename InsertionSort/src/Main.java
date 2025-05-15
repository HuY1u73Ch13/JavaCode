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
        InsertionSort insert = new InsertionSort();
        
        //Enter number of array
        int sizeArray = insert.input();
        //create array
        insert.createArray(sizeArray);
        //create random array
        insert.createRandomArray();
        //display unsort array
        insert.display("Unsorted array: ");
        //sort
        insert.sort();
        //display sort array
        insert.display("Sorted array:"); 
    }
}
