/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Healthmodel;

/**
 *
 * @author chava
 */
public class Patient {
    
    public Person person = new Person();
    public int patientId;
    public float patientWeight;
    public float patientHeight;
    public String bloodGroup;
    public String patientUsername;
    public String patientpwd;
    
    
    
    public VitalSigns vitalSigns = new VitalSigns();
    

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public float getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(float patientWeight) {
        this.patientWeight = patientWeight;
    }

    public float getPatientHeight() {
        return patientHeight;
    }

    public void setPatientHeight(float patientHeight) {
        this.patientHeight = patientHeight;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    public String getPatientpwd() {
        return patientpwd;
    }

    public void setPatientpwd(String patientpwd) {
        this.patientpwd = patientpwd;
    }
    
    

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    @Override
    public String toString(){
        return person.name;
    }
    
    
}
