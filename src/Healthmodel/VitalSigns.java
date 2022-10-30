/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Healthmodel;

import javax.swing.JTextField;

/**
 *
 * @author chava
 */
public class VitalSigns extends Patient{
    public float bodyTemperature;
    public float bloodPressure;
    public float sugarLevel;
    public String symptoms;
public VitalSigns(float bodyTemperature, float bloodPressure,float sugarLevel,String symptoms){
    this.bodyTemperature=bodyTemperature;
    this.bloodPressure=bloodPressure;
    this.sugarLevel=sugarLevel;
    this.symptoms=symptoms;    
}
public VitalSigns(){
}

    public float getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(float bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(float sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    
    
    
}
