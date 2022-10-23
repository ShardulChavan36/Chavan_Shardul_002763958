/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Healthmodel;

import java.util.ArrayList;

/**
 *
 * @author chava
 */
public class PersonDirectory{
    public static ArrayList<Person>personDir = new ArrayList<Person>();

    public static ArrayList<Person> getPersonDir() {
        return personDir;
    }

    public static void setPersonDir(ArrayList<Person> personDir) {
        PersonDirectory.personDir = personDir;
    }
    
    public static Person person1(){
        return new Person(2,"Shardul", 21, 766371921, "abc", "male", 10, 02121,"Boylston",  "Boston", "MA");
        
    }

    
    }

