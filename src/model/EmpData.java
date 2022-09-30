/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author chava
 */
public class EmpData {
    private ArrayList<EmpDetails> saved_data;
    public EmpData(){
         this.saved_data=new ArrayList<EmpDetails>();      
         
    }

    public ArrayList<EmpDetails> getSaved_data() {
        return saved_data;
    }

    public void setSaved_data(ArrayList<EmpDetails> saved_data) {
        this.saved_data = saved_data;
    }
    public EmpDetails saveEmpDetails(){
        EmpDetails emp=new EmpDetails();
        saved_data.add(emp);
        return emp;
    }
    
    
}
