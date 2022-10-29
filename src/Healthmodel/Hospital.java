/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Healthmodel;

/**
 *
 * @author chava
 */
public class Hospital {
    public String hospName;
    public int hospLicNo;
    public int hospWard;
    public String hospAddress;
    public House residence = new House();

    public String getHospName() {
        return hospName;
    }

    public void setHospName(String hospName) {
        this.hospName = hospName;
    }

    public int getHospLicNo() {
        return hospLicNo;
    }

    public void setHospLicNo(int hospLicNo) {
        this.hospLicNo = hospLicNo;
    }

    public int getHospWard() {
        return hospWard;
    }

    public void setHospWard(int hospWard) {
        this.hospWard = hospWard;
    }

    public String getHospAddress() {
        return hospAddress;
    }

    public void setHospAddress(String hospAddress) {
        this.hospAddress = hospAddress;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }
    
    @Override 
    public String toString(){
        return String.valueOf(hospLicNo);
    }
    
}
