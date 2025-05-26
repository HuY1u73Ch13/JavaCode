
import com.sun.org.apache.bcel.internal.classfile.Code;
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
    Utility utility = new Utility();

    void mockData() {
        countryList.add(new EastAsiaCountries("VN", "Viet Nam", 4564564, "Nice"));
        countryList.add(new EastAsiaCountries("TL", "Thai Lan", 4564564, "Nice"));
    }

    protected void inputCountry() {
        String code, name, terrain;
        float area;
        if (countryList.size() == 11) {
            System.out.println("Enough country !!!");
        }
        while (true) {
            code = utility.getString("Enter code of country: ", "Wrong", utility.REGEX_CODE);
            if (checkDuplicateCode(code) == true) {
                System.out.println("DuplicateCode !!!");
            } else {
                break;
            }
        }
        while (true) {
            name = utility.getString("Enter code of country: ", "Wrong", utility.REGEX_CODE);
            if (checkDuplicateName(name) == true) {
                System.out.println("DuplicateName !!!");
            } else {
                break;
            }
        }
        area = utility.getFloat("Enter total Area: ", "Wrong", 0, Float.MAX_VALUE);
        terrain = utility.getString("Enter terrain of country: ", "Wrong", utility.REGEX_NAME);
        EastAsiaCountries country = new EastAsiaCountries(code, name, area, terrain);
        countryList.add(country);
    }

    private boolean checkDuplicateCode(String code) {
        for (EastAsiaCountries asiaCountries : countryList) {
            if (asiaCountries.getCountryCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDuplicateName(String name) {
        for (EastAsiaCountries asiaCountries : countryList) {
            if (asiaCountries.getCountryName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    void displayCountryJustInput() {
        if (countryList.isEmpty()) {
            System.out.println("No Country in the list !!!");
            return;
        }
        System.out.printf("%-10s %-15s %-10s %-10s\n", "ID", "Name", "Area", "Terrain");
        countryList.get(countryList.size() - 1).display();
    }

    void searchCountryByName() {
        String name = utility.getString("Enter code of country: ", "Wrong", utility.REGEX_CODE).toUpperCase();
        ArrayList<EastAsiaCountries> searchList = new ArrayList<>();

        for (EastAsiaCountries asiaCountries : countryList) {
            if (asiaCountries.getCountryName().toUpperCase().contains(name)) {
                searchList.add(asiaCountries);
            }
        }

        if (searchList.isEmpty()) {
            System.out.println("No Country in the list !!!");
            return;
        } else {
            System.out.printf("%-10s %-15s %-10s %-10s\n", "ID", "Name", "Area", "Terrain");
            for (EastAsiaCountries asiaCountries : searchList) {
                asiaCountries.display();
            }
        }
    }

    void sortCountry() {
        ArrayList<EastAsiaCountries> sortList = new ArrayList<>();

        sortList.addAll(countryList);
        if (sortList.isEmpty()) {
            System.out.println("No Country in the list !!!");
            return;
        }
        Collections.sort(sortList, new Comparator<EastAsiaCountries>() {
            @Override
            public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
                return o1.getCountryName().compareToIgnoreCase(o2.getCountryName());
            }
        });
        System.out.printf("%-10s %-15s %-10s %-10s\n", "ID", "Name", "Area", "Terrain");
        for (EastAsiaCountries asiaCountries : sortList) {
            asiaCountries.display();
        }
    }
}
