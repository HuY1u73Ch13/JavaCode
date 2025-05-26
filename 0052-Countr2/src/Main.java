
import java.time.Clock;

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
        Utility u = new Utility();
        ManageEastAsiaCountries manage = new ManageEastAsiaCountries();
        manage.mockData();
        while (true) {
            System.out.println("                                   MENU\n" +
                            "==========================================================================\n" +
                            "1. Input the information of 11 countries in East Asia\n" +
                            "2. Display the information of country you've just input\n" +
                            "3. Search the information of country by user-entered name\n" +
                            "4. Display the information of countries sorted name in ascending order  \n" +
                            "5. Exit \n" +
                            "==========================================================================");
            int option = u.getInteger("Option: ", "Wrong", 1, 5);
            
            switch (option) {
                case 1:
                    //input country information
                    manage.inputCountry();
                    break;
                case 2:
                    //display country just input
                    manage.displayCountryJustInput();
                    break;
                case 3:
                    //search country by name
                    manage.searchCountryByName();
                    break;
                case 4:
                    //sort country by code
                    manage.sortCountry();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
