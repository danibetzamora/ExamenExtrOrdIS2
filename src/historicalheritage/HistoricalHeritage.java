/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historicalheritage;

import model.BridgesCatalogue;
import model.BuildingsCatalogue;
import model.BustsCatalogue;
import model.ChurchsCatalogue;
import model.GraffitisCatalogue;
import model.PatrimonialCatalogue;
import model.PatrimonialElement;
import model.StatuesCatalogue;
import presenter.PatrimonialCataloguePresenter;
import view.PatrimonialCatalogueView;

/**String type, String location, String name, String author, int year, String method, String material, String state, int pictures
 *
 * @author Usuario
 */
public class HistoricalHeritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PatrimonialCatalogueView view = new PatrimonialCatalogueView();
        BustsCatalogue catalogue1 = new BustsCatalogue();
        StatuesCatalogue catalogue2 = new StatuesCatalogue();
        ChurchsCatalogue catalogue3 = new ChurchsCatalogue();
        BuildingsCatalogue catalogue4 = new BuildingsCatalogue();
        BridgesCatalogue catalogue5 = new BridgesCatalogue();
        GraffitisCatalogue catalogue6 = new GraffitisCatalogue();
        
        PatrimonialElement bust = new PatrimonialElement("Busto", "Tamaraceite","Busto Moderno", "Pedro Armas", 2002, "Cincel", "Mármol Negro", "Algo Deteriorado", 6 );
        catalogue1.addPatrimonialElement(bust);
        
        PatrimonialElement statue = new PatrimonialElement("Estatua", "Mogán","Madre Tierra", "Lara Castro", 2008, "A mano", "Mármol Blanco", "Perfecto Estado", 3 );
        catalogue2.addPatrimonialElement(statue);
        
        PatrimonialElement church = new PatrimonialElement("Iglesia", "Teror","Iglesia del Pino", "Guillermo Ortega", 1965, "Maquinaria Pesada", "Ladrillo", "Buen Estado", 10 );
        catalogue3.addPatrimonialElement(church);
        
        PatrimonialElement building = new PatrimonialElement("Edificio", "Guanarteme","Edificio Mapfre", "Cristina Soler", 1978, "Maquinaria Pesada", "Cemento", "Mal Estado", 4 );
        catalogue4.addPatrimonialElement(building);
        
        PatrimonialElement bridge = new PatrimonialElement("Puente", "Agaete", "Puente Alto", "María Pérez", 2010, "Maquinaria Pesada", "Piedra", "Perfecto Estado", 5 );
        catalogue5.addPatrimonialElement(bridge);
        
        PatrimonialElement graffiti = new PatrimonialElement("Grafiti", "Telde","Grafiti Baloncesto", "Patricio Ojeda", 2018, "A mano", "Spray", "Algo Deteriorado", 9 );
        catalogue6.addPatrimonialElement(graffiti);
        
        
        PatrimonialCataloguePresenter presenter = new PatrimonialCataloguePresenter(catalogue1, catalogue2, catalogue3, catalogue4, catalogue5, catalogue6, view);
        
        view.setPresenter(presenter);
        view.setVisible(true);
        view.clearFields();
        view.showBusts();
        view.showStatues();
        view.showChurchs();
        view.showBuildings();
        view.showBridges();
        view.showGraffitis();
    }
    
}
