
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ManageEastAsiaCountries {
    
    ArrayList<EastAsiaCountries> countryList = new ArrayList<>();
    Utility u = new Utility();
    protected  void inputCountry() {
        if(countryList.size()==11){
            System.out.println("Enough country !!");
            return;
        }
        String code, name , terrain;
        float area;
        while (true) {            
            code = u.getString("Enter code of country: ", "Wrong", u.REGEX_CODE);
            if(checkDuplicateCode(code)){
                System.out.println("DuplicateCode !!!");
            }else{
                break;
            }
        }
        while (true) {            
            name = u.getString("Enter name of country: ", "Wrong", u.REGEX_NAME);
            if(checkDuplicateName(name)){
                System.out.println("DuplicateName !!!");
            }else{
                break;
            }
        }
        area = u.getFloat("Enter total Area: ", "Wrong", 0, Float.MAX_VALUE);
        terrain = u.getString("Enter terrain of country: ", "Wrong", u.REGEX_NAME);
        EastAsiaCountries country = new EastAsiaCountries(terrain, code, name, area);
        countryList.add(country);
    }   

    private boolean checkDuplicateCode(String code) {
        for(EastAsiaCountries asiaCountry : countryList){
            if(asiaCountry.getCountryCode().equalsIgnoreCase(code)){
                return true;
            }
        }
        return false;
    }

    private boolean checkDuplicateName(String name) {
        for(EastAsiaCountries asiaCountry : countryList){
            if(asiaCountry.getCountryName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }

    void displayCountryJustInput() {
        if(countryList.isEmpty()){
            System.out.println("No country in list !!!");
            return;
        }
        System.out.printf("%-10s %-15s %-10s %-10s\n", "ID", "Name", "Area", "Terrain");
        countryList.get(countryList.size() - 1).display();
    }
    void searchCountryByName(){
        String name = u.getString("Enter name: ","Wrong",u.REGEX_NAME).toUpperCase();
        ArrayList<EastAsiaCountries> searchList = new ArrayList<>();
        for(EastAsiaCountries asiaCountry : countryList){
            if(asiaCountry.getCountryName().toUpperCase().contains(name)){
                searchList.add(asiaCountry);
            }
        }
        if(searchList.isEmpty()){
            System.out.println("NOT FOUND !!");
        }else {
            System.out.printf("%-10s %-15s %-10s %-10s\n", "ID", "Name", "Area", "Terrain");
            for(EastAsiaCountries asiaCountry : countryList){
                asiaCountry.display();
            }
        }
    }

    /*void sortCountry() {
        if(countryList.isEmpty()){
            System.out.println("List is empty !!!");
            return;
        }
        Collection.sort(countryList, new Comparator<EastAsiaCountries>(){
            @Override
            public int compare(EastAsiaCountries o1, EastAsiaCountries o2){
                return o1.getCountryName().compareToIgnoreCase(o2.countryName);
            }
        });
    }*/
    
}
