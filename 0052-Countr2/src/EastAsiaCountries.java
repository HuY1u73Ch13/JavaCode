/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class EastAsiaCountries extends Country {

    private String terrain;

    public EastAsiaCountries() {
        super();
    }

    public EastAsiaCountries(String terrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.terrain = terrain;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    @Override
    public void display() {
        super.display(); 
        System.out.printf("%-10s\n", terrain);
    }
}
