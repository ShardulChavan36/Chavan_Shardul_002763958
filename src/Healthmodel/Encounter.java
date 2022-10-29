/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Healthmodel;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author chava
 */
public class Encounter {
    public int encId;
    public Date encDate;
    public LocalTime encTime;
    public String encDiagnosis;
    
    public Patient patient = new Patient();
    public Person person = new Person();
    public Doctor doc = new Doctor();
    public VitalSigns vitalSigns = new VitalSigns();

    public int getEncId() {
        return encId;
    }

    public void setEncId(int encId) {
        this.encId = encId;
    }

    public Date getEncDate() {
        return encDate;
    }

    public void setEncDate(Date encDate) {
        this.encDate = encDate;
    }


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public LocalTime getEncTime() {
        return encTime;
    }

    public void setEncTime(LocalTime encTime) {
        this.encTime = encTime;
    }
    

    public String getEncDiagnosis() {
        return encDiagnosis;
    }

    public void setEncDiagnosis(String encDiagnosis) {
        this.encDiagnosis = encDiagnosis;
    }
    

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    @Override 
    public String toString(){
        return String.valueOf(encId);
    }
        
}
