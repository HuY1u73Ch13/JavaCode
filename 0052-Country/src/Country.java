/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Country {
    private String code,name;
    private float area;

    public Country() {
    }

    public Country(String code, String name, float area) {
        this.code = code;
        this.name = name;
        this.area = area;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAera() {
        return area;
    }

    public void setAera(float area) {
        this.area = area;
    }
    
    public void display(){
        System.out.format("%-10s %-15s %-10s", code , name , area);
    }
}
