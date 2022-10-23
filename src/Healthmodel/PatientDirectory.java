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

    public static ArrayList<Patient> getPatientDir() {
        return patientDir;
    }

    public static void setPatientDir(ArrayList<Patient> patientDir) {
        PatientDirectory.patientDir = patientDir;
    }

}




