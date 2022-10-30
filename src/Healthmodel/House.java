/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Healthmodel;

/**
 *
 * @author chava
 */
public class House extends Community{
    public int houseNo;
    public int zip;

    public House(){
    }
    public House(String cityName, String state, String communityName, int houseNo, int zip){
        super(cityName, state, communityName);
        this.houseNo = houseNo;
        this.zip = zip;
    }
    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    public String validateHouse(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = "House No cannot be empty! \n";
        } else if (name.length() < 2 || name.length() > 30) {
            isValid = "House No must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!name.matches("[0-9]{1,4}")) {
            isValid = "Invalid House No Field! \n";
        }else if (name.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
   
}
