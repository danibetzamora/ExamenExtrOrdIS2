/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import model.BridgesCatalogue;
import model.BuildingsCatalogue;
import model.BustsCatalogue;
import model.ChurchsCatalogue;
import model.GraffitisCatalogue;
import model.PatrimonialCatalogue;
import model.PatrimonialElement;
import model.StatuesCatalogue;
import view.PatrimonialCatalogueView;

/**
 *
 * @author Usuario
 */
public class PatrimonialCataloguePresenter {

    public BustsCatalogue catalogue1;
    public StatuesCatalogue catalogue2;
    public ChurchsCatalogue catalogue3;
    public BuildingsCatalogue catalogue4;
    public BridgesCatalogue catalogue5;
    public GraffitisCatalogue catalogue6;
    public PatrimonialCatalogueView view;
    
    public PatrimonialCataloguePresenter(BustsCatalogue catalogue1, StatuesCatalogue catalogue2, ChurchsCatalogue catalogue3, BuildingsCatalogue catalogue4, BridgesCatalogue catalogue5, GraffitisCatalogue catalogue6, PatrimonialCatalogueView view){
        this.catalogue1 = catalogue1;
        this.catalogue2 = catalogue2;
        this.catalogue3 = catalogue3;
        this.catalogue4 = catalogue4;
        this.catalogue5 = catalogue5;
        this.catalogue6 = catalogue6;
        this.view = view;
    }
    
    public void addElement(PatrimonialElement element, String type){
        switch (type){
            case "Busto":
                catalogue1.addPatrimonialElement(element);
                view.showBusts();
                break;
            case "Estatua":
                catalogue2.addPatrimonialElement(element);
                view.showStatues();
                break;
            case "Iglesia":
                catalogue3.addPatrimonialElement(element);
                view.showChurchs();
                break;
            case "Edificio":
                catalogue4.addPatrimonialElement(element);
                view.showBuildings();
                break;
            case "Puente":
                catalogue5.addPatrimonialElement(element);
                view.showBridges();
                break;
            case "Grafiti":
                catalogue6.addPatrimonialElement(element);
                view.showGraffitis();
                break;
        }
    }
    
    
}
