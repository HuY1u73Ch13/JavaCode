
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

    Scanner s = new Scanner(System.in);

    int input(String message) {
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

    public int[] fibonacci(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        return fib;
    }
    public void display(int n, boolean useRecursive) {
        if (useRecursive) {
            System.out.println("\nFibonacci sequence (calculated using recursion):");
            for (int i = 0; i < n; i++) {
                System.out.print(fibo(i));
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println("\nFibonacci sequence (calculated using array method):");
            int[] fib = fibonacci(n);
            for (int i = 0; i < n; i++) {
                System.out.print(fib[i]);
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

}
