/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class BinarySearch {

    public static int search(int[] array, int n) {
        int d = 1;
        int c = array.length - 1;
        int g;
        while (d <= c) {
            g = (d + c) / 2;
            if (array[g] == n) {
                return g;
            } else if (array[g] < n) {
                d = g + 1;
            } else {
                c = g - 1;
            }
        }
        return -1;
    }
}
