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
public class BridgesCatalogue implements PatrimonialCatalogue{

    public ArrayList<PatrimonialElement> bridgesCatalogue;
    
    public BridgesCatalogue(){
        bridgesCatalogue = new ArrayList();
    }
    @Override
    public void addPatrimonialElement(PatrimonialElement element) {
        bridgesCatalogue.add(element);
    }
    
}
