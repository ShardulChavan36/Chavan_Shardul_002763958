/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Healthmodel;

/**
 *
 * @author chava
 */
public class Doctor {
    public Person person = new Person();
    public int docId; 
    public String docQualifications;
    public String docSpecialize;
    public String docPwd;
    public Doctor(){
    }
    public Doctor(int docId,int personID,String name, int age, long contactNo, String emailId, String gender, int houseNo, int zip, String communityName, String newCity, String state, String docQualifications, String docSpecialize,String docPwd){
        this.docId=docId;
        this.person.personId=personID;
        this.person.name=name;
        this.person.age=age;
        this.person.gender=gender;        
        this.docPwd=docPwd;
        this.docQualifications=docQualifications;
        this.docSpecialize=docSpecialize;
        this.person.contactNo=contactNo;
        this.person.emailId=emailId;
        this.person.gender=gender;
        this.person.residence.houseNo=houseNo;
        this.person.residence.zip=zip;
        this.person.residence.communityName=communityName;
        this.person.residence.newCity=newCity;
        this.person.residence.state=state;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
