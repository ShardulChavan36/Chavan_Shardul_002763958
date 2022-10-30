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
public class Community extends City{
    public String communityName;
    public static ArrayList<House> houseDir = new ArrayList<>();
    
        public Community(){
    }

    public Community(String newCity, String state, String communityName){
        super(newCity, state);
        this.communityName = communityName;
    }
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    
    public String validateCommunityName(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = "Community Name cannot be empty! \n";
        } else if (name.length() < 2 || name.length() > 30) {
            isValid = "Community Name must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!name.matches("[a-zA-Z ]{2,30}")) {
            isValid = "Invalid Community Name Field! \n";
        }else if (name.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
    
    public Boolean alreadtExists(String city, String community) {
        Boolean found = false;
        for (int i = 0; i < City.communityDirectory.size(); i++) {
            if (city.equals(City.communityDirectory.get(i).newCity) && community.equals(City.communityDirectory.get(i).communityName)) {
                found = true;
            }
        }
        return found;
    }
    
}
