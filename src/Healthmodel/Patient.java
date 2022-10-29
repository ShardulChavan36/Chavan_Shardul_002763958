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
    public String patientpwd;
    public VitalSigns vitalSigns = new VitalSigns();
    
    public Patient(){
    }
    public Patient(int patientId,int personID,String name, int age, long contactNo, String emailId, String gender, int houseNo, int zip, String communityName, String newCity, String state,float patientWeight,float patientHeight, String bloodGroup, String patientpwd){
        this.patientId=patientId;
        this.person.personId=personID;
        this.person.name=name;
        this.person.age=age;
        this.person.gender=gender;
        this.patientWeight=patientWeight;
        this.patientHeight=patientHeight;
        this.bloodGroup=bloodGroup;
        
        this.patientpwd=patientpwd;
        this.person.contactNo=contactNo;
        this.person.emailId=emailId;
        this.person.gender=gender;
        this.person.residence.houseNo=houseNo;
        this.person.residence.zip=zip;
        this.person.residence.communityName=communityName;
        this.person.residence.newCity=newCity;
        this.person.residence.state=state;
    }
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
        return String.valueOf(patientId);
    }
    
    
    
}
