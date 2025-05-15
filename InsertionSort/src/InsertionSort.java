
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class InsertionSort {

    int array[];

    int input() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Number of Array: ");
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.err.println("Input can't be empty.");
                } else {
                    int number = Integer.parseInt(input);
                    //check number in range
                    if (number >= 0 && number <= Integer.MAX_VALUE) {
                        return number;
                    }
                }
            } catch (Exception e) {
                System.err.println("Must be number.");
            }
        }
    }

    void createArray(int sizeArray) {
        array = new int[sizeArray];
    }

    void createRandomArray() {
        Random random = new Random();
        //sinh ra phan tu ngau nhien
        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(array.length);
            array[i] = randomNumber;
        }
    }

    void display(String message) {
        System.out.print(message + "[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }

    void sort() {
    int currentValue, compareIndex;
    for (int i = 1; i < array.length; i++) {
        currentValue = array[i];            // Giá trị hiện tại cần chèn vào đúng vị trí
        compareIndex = i - 1;               // So sánh từ phần tử đứng trước

        while (compareIndex >= 0 && currentValue < array[compareIndex]) {
            array[compareIndex + 1] = array[compareIndex]; // Dịch phần tử lớn hơn sang phải
            compareIndex--;
        }

        array[compareIndex + 1] = currentValue; // Chèn currentValue vào đúng vị trí
    }
}

}
