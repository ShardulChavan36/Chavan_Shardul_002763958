/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;
import javax.swing.*;
import java.time.LocalDate;
/**
 *
 * @author chava
 */
public class EmpDetails {
    private String name;
    private String gender;
    private String team_info;
    private String Pos_title;
    private String email_id;
    
    private int age;
    private int empid;
    private long cell_no;
    private LocalDate start_date;
    private ImageIcon icon;

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTeam_info() {
        return team_info;
    }

    public void setTeam_info(String team_info) {
        this.team_info = team_info;
    }

    public String getPos_title() {
        return Pos_title;
    }

    public void setPos_title(String Pos_title) {
        this.Pos_title = Pos_title;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public long getCell_no() {
        return cell_no;
    }

    public void setCell_no(long cell_no) {
        this.cell_no = cell_no;
    }


    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public EmpDetails saveEmpDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
