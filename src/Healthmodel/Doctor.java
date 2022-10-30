/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Healthmodel;

import java.util.Date;

/**
 *
 * @author chava
 */
public class Doctor extends Person{
    public int docId; 
    public String docQualifications;
    public String docSpecialize;
    public String docPwd;
    public Hospital hosp = new Hospital();
    public Doctor(){
    }
    public Doctor(int docId,int personID,String name, int age, long contactNo, String emailId, String gender, int houseNo, int zip, String communityName, String newCity, String state, String docQualifications, String docSpecialize,String docPwd){
        super( personID, name, age,  contactNo,  emailId,  gender,  houseNo,  zip,  communityName,  newCity,  state);
        this.docId=docId;
        this.personId=personID;
        this.name=name;
        this.age=age;
        this.gender=gender;        
        
        this.contactNo=contactNo;
        this.emailId=emailId;
        this.gender=gender;
        this.residence.houseNo=houseNo;
        this.residence.zip=zip;
        this.residence.communityName=communityName;
        this.residence.newCity=newCity;
        this.residence.state=state;
        
        this.docPwd=docPwd;
        this.docQualifications=docQualifications;
        this.docSpecialize=docSpecialize;
    }
        
    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDocQualifications() {
        return docQualifications;
    }

    public void setDocQualifications(String docQualifications) {
        this.docQualifications = docQualifications;
    }

    public String getDocSpecialize() {
        return docSpecialize;
    }

    public void setDocSpecialize(String docSpecialize) {
        this.docSpecialize = docSpecialize;
    }


    public String getDocPwd() {
        return docPwd;
    }

    public void setDocPwd(String docPwd) {
        this.docPwd = docPwd;
    }
    
    @Override
    public String toString(){
        return String.valueOf(docId);
    }
    
}
