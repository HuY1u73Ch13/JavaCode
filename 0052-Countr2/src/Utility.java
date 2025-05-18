
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class Utility {

    public final String REGEX_CODE = "[a-zA-Z]+";
    public final String REGEX_NAME = "[a-zA-Z ]+";

    // access modifier + (static) +return type + name method
    public int getInteger(String message, String error, int min, int max) {
        Scanner scanner = new Scanner(System.in);

        //- Yêu cầu người dùng nhập vào một số nguyên
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    System.err.println("Input cannot be empty !!");
                } else {
                    int number = Integer.parseInt(input);
                    //check number in range
                    if (number >= min && number <= max) {
                        return number;
                    } else {
                        System.err.println("You must enter within " + min + "-" + max);
                    }
                }
            } catch (Exception e) {
                System.err.println(error);
            }
        }
    }

    public static double getDouble(String message, String error, double min, double max) {
        Scanner scanner = new Scanner(System.in);

        //- Yêu cầu người dùng nhập vào một số nguyên
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    System.err.println("Input cannot be empty !!");
                } else {
                    double number = Double.parseDouble(input);
                    //check number in range
                    if (number >= min && number <= max) {
                        return number;
                    } else {
                        System.err.println("You must enter within " + min + "-" + max);
                    }
                }
            } catch (Exception e) {
                System.err.println(error);
            }
        }
    }

    public static float getFloat(String message, String error, float min, float max) {
        Scanner scanner = new Scanner(System.in);

        //- Yêu cầu người dùng nhập vào một số nguyên
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    System.err.println("Input cannot be empty !!");
                } else {
                    float number = Float.parseFloat(input);
                    //check number in range
                    if (number >= min && number <= max) {
                        return number;
                    } else {
                        System.err.println("You must enter within " + min + "-" + max);
                    }
                }
            } catch (Exception e) {
                System.err.println(error);
            }
        }
    }

    public static String getString(String message, String error, String regex) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //nhap vao
            System.out.println(message);
            String input = scanner.nextLine();
            //kiem tra xem input co rong hay khong
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty !!");
            } else {
                //kiem tra xem input co matches regex hay ko
                //neu nhu matches voi regex => return string
                if (input.matches(regex)) {
                    return input;
                } else {
                    //tell error
                    System.out.println(error);
                }
            }
        }
    }
}
