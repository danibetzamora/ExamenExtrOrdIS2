/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ChurchsCatalogue implements PatrimonialCatalogue{

    public ArrayList<PatrimonialElement> churchsCatalogue;
    
    public ChurchsCatalogue(){
        churchsCatalogue = new ArrayList();
    }
    @Override
    public void addPatrimonialElement(PatrimonialElement element) {
        churchsCatalogue.add(element);
    }
    
}
