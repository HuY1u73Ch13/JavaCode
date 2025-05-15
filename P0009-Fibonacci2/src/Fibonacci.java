
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Fibonacci {

    private int[] array;

    int input(String message) {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(message);
                String input = s.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Input can't be empty !!!");
                } else {
                    int number = Integer.parseInt(input);
                    if (number >= 0 && number <= Integer.MAX_VALUE) {
                        return number;
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
    }

    public int fibo(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public int[] fibo2(int n) {
        array = new int[n];
        array[0] = 0;
        array[1] = 1;
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array;
    }

    void display(int n, boolean selec) {
        if (selec == true) {
            System.out.println("Recursion: ");
            for (int i = 0; i <= n; i++) {
                System.out.println(fibo(i) + ", ");
            }
        } else if (selec == false) {
            System.out.println("Array: ");
            int[] array = fibo2(n);
            for (int i = 0; i < n; i++) {
                System.out.println(array[i] + ", ");
            }
        }
    }

}
