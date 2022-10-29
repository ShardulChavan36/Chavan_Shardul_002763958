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
public class DoctorDirectory {
    public static ArrayList<Doctor>docDir = new ArrayList<Doctor>();

    public static ArrayList<Doctor> getDocDir() {
        return docDir;
    }

    public static void setDocDir(ArrayList<Doctor> docDir) {
        DoctorDirectory.docDir = docDir;
    }
    
    
}
