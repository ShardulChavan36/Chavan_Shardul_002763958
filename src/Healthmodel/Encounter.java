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
public class Encounter extends VitalSigns {
    public int encId;
    public Date encDate;
    public LocalTime encTime;
    public String encDiagnosis;
    
    public Patient patient = new Patient();
    public Doctor doc = new Doctor();
    public Encounter(){
    }
    public Encounter (int encId,int patientId,int docId,String name, String name1, String emailId,Date encDate,LocalTime encTime ){
        this.encId=encId;
        this.patient.patientId=patientId;
        this.doc.docId=docId;
        this.patient.name=name;
        this.doc.name=name1;
        this.doc.emailId=emailId;
        this.encDate=encDate;
        this.encTime=encTime;
    }
    public Encounter (int encId,int patientId,int docId,Date encDate,LocalTime encTime){
        this.encId=encId;
        this.patient.patientId=patientId;
        this.doc.docId=docId;
        this.encDate=encDate;
        this.encTime=encTime;
    }
    public Encounter(int encId,int patientId,int docId,String name, String name1, String emailId,Date encDate,LocalTime encTime,float bodyTemperature, float bloodPressure,float sugarLevel,String symptoms,String encDiagnosis ){
        super(bodyTemperature,  bloodPressure, sugarLevel, symptoms);
        this.encId=encId;
        this.patient.patientId=patientId;
        this.doc.docId=docId;
        this.patient.name=name;
        this.doc.name=name1;
        this.doc.emailId=emailId;
        
        this.encDate=encDate;
        this.encTime=encTime;
        this.encDiagnosis=encDiagnosis;
        
        
        this.bodyTemperature=bodyTemperature;
        this.bloodPressure=bloodPressure;
        this.sugarLevel=sugarLevel;
        this.symptoms=symptoms; 
       
    }
    
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
    

    
    
    @Override 
    public String toString(){
        return String.valueOf(encId);
    }

    public void setDate(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
