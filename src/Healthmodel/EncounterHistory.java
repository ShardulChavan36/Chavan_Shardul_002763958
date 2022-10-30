/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Healthmodel;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

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
    
    public Encounter addNewEncounter(int encId,int patientId,int docId,String name, String name1, String emailId,Date encDate,LocalTime encTime){
        Encounter enc = new Encounter(encId, patientId, docId,name,  name1,  emailId, encDate, encTime);
        //System.out.println("hereeeeeeeeee");
        //System.out.println(newEmployee);
        encHis.add(enc);
        return enc;
        
    }
    public Encounter addNewEncounter(int encId,int patientId,int docId,Date encDate,LocalTime encTime){
        Encounter enc = new Encounter(encId, patientId, docId,encDate, encTime);
        encHis.add(enc);
        return enc;
        
    }
}
