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
public class StatuesCatalogue implements PatrimonialCatalogue{

    public ArrayList<PatrimonialElement> statuesCatalogue;
    
    public StatuesCatalogue(){
        statuesCatalogue = new ArrayList();
    }
    @Override
    public void addPatrimonialElement(PatrimonialElement element) {
        statuesCatalogue.add(element);
    }
    
}
