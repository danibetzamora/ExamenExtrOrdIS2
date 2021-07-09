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
public class GraffitisCatalogue implements PatrimonialCatalogue{

    public ArrayList<PatrimonialElement> graffitisCatalogue;
    
    public GraffitisCatalogue(){
        graffitisCatalogue = new ArrayList();
    }
    @Override
    public void addPatrimonialElement(PatrimonialElement element) {
        graffitisCatalogue.add(element);
    }
    
}
