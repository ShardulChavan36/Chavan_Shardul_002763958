/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Healthmodel;

import java.util.ArrayList;

/**
 *
 * @author chava
 */
public class City {
    
    public String newCity;
    public static String state;
    public static ArrayList<Community> communityDirectory=new ArrayList<>();

    public City(){
    }
    
    public City(String newCity, String state){
        this.newCity = newCity;
        City.state = "Massachusetts";
    }
    public String getNewCity() {
        return newCity;
    }

    public void setNewCity(String newCity) {
        this.newCity = newCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String validateCityName(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = "City Name cannot be empty! \n";
        } else if (name.length() < 2 || name.length() > 30) {
            isValid = "City Name must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!name.matches("[a-zA-Z ]{2,30}")) {
            isValid = "Invalid City Name Field! \n";
        }else if (name.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
    public Boolean alreadtExists(String state, String city) {
        Boolean found = false;
        for (int i = 0; i < State.cityDir.size(); i++) {
            if (city.equals(State.cityDir.get(i).state) && city.equals(State.cityDir.get(i).newCity)) {
                found = true;
            }
        }
        return found;
    }
    
}
