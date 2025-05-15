/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class EastAsiaCountry extends Country{
    private String terrain;

    public EastAsiaCountry() {
        super();
    }

    public EastAsiaCountry(String terrain, String code, String name, float area) {
        super(code, name, area);
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
        System.out.format("%-10s\n", terrain);
    }
}
