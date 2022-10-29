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
public class EncounterHistory {
     public static ArrayList<Encounter>encHis = new ArrayList<Encounter>();

    public static ArrayList<Encounter> getEncHis() {
        return encHis;
    }

    public static void setEncHis(ArrayList<Encounter> encHis) {
        EncounterHistory.encHis = encHis;
    }
    public void delEncDetails(Encounter e){
    encHis.remove(e);
    }
    
}
