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
public class PatientDirectory {
    public static ArrayList<Patient>patientDir = new ArrayList<Patient>();

    
     public static Patient patient1(){
        return new Patient(99,2,"Tanmay", 22, 766371921, "abc", "male", 10, 02121,"Boylston",  "Boston", "MA",22.2f,33.3f,"A+","tan");
        
    }
    
    public static ArrayList<Patient> getPatientDir() {
        return patientDir;
    }

    public static void setPatientDir(ArrayList<Patient> patientDir) {
        PatientDirectory.patientDir = patientDir;
    }
    public void delPatientDetails(Patient p){
    patientDir.remove(p);
    }
}




