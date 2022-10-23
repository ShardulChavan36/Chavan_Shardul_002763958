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
public class VitalSignsHistory {
    public static ArrayList<VitalSigns>vitalDir = new ArrayList<VitalSigns>();

    public static ArrayList<VitalSigns> getVitalDir() {
        return vitalDir;
    }

    public static void setVitalDir(ArrayList<VitalSigns> vitalDir) {
        VitalSignsHistory.vitalDir = vitalDir;
    }
    
    
}
