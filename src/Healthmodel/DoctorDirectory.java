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

    public static Doctor doc1(){
        return new Doctor(9,3,"Vipul", 26, 76632621, "vipul@", "male", 20, 02221,"Boylston",  "Boston", "MA","MBBS","Brain Specialist","vip");
        
    }
    public static ArrayList<Doctor> getDocDir() {
        return docDir;
    }

    public static void setDocDir(ArrayList<Doctor> docDir) {
        DoctorDirectory.docDir = docDir;
    }
    
    public boolean checkDID(int dID){
        int flag = 0;
        for(Doctor d: getDocDir()){
            if(d.getDocId()== dID)
                flag = 1;
            else
                flag = 0;
        }
        if(flag>0)
            return true;
        else
            return false;
    } 
    
    
}
