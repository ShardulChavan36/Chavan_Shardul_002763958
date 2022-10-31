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
public class HospitalDirectory {
    public static ArrayList<Hospital>hospDir = new ArrayList<Hospital>();

    public static ArrayList<Hospital> getHospDir() {
        return hospDir;
    }

    public static void setHospDir(ArrayList<Hospital> hospDir) {
        HospitalDirectory.hospDir = hospDir;
    }
     public void delHospDetails(Hospital h){
    hospDir.remove(h);
    }
    
}
