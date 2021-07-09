/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author danib
 */
public class BustsCatalogue implements PatrimonialCatalogue {

    public ArrayList<PatrimonialElement> bustsCatalogue;
    
    public BustsCatalogue(){
        bustsCatalogue = new ArrayList();
    }
    @Override
    public void addPatrimonialElement(PatrimonialElement element) {
        bustsCatalogue.add(element);
    }
    
}
