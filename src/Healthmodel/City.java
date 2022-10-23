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
    public static String[] cityNames={"Boston","Cambridge","Worcester","Lowell"};
    public String newCity;
    public String state;
    public static ArrayList<Community> communityDirectory=new ArrayList<>();

    public City(){
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
    
}
