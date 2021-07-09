/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class PatrimonialElement {

    String type;
    String location;
    String name;
    String author;
    int year;
    String method;
    String material;
    String state;
    int pictures;
    
    public PatrimonialElement(String type, String location, String name, String author, int year, String method, String material, String state, int pictures){
        this.type = type;
        this.location = location;
        this.name = name;
        this.author = author;
        this.year = year;
        this.method = method;
        this.material = material;
        this.state = state;
        this.pictures = pictures;
    }
    
    @Override
    public String toString(){
        return "| " + type + " | " + location + " | " + name + " | " + author + " | " + year + " | " + method + " | " +  material + " | " + state + " | " + pictures + " imágenes|";
    }
    
}
