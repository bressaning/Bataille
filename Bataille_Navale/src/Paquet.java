
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author licence
 */
public class Paquet {
    private List<Carte> cartesList;
    private String[] couleur = {"Coeur", "Trefle", "Carreau", "Pique"};
    
    public Paquet(){
        cartesList = new ArrayList<Carte>();
        for (int i=0; i<4; i++){
            for(int j=1; j<=13; j++){
                cartesList.add(new Carte(couleur[i], j));
            }
        }
        Collections.shuffle(cartesList);
    }
    
    public Paquet(int nbCarte){
        cartesList = new ArrayList<Carte>();
        for (int i=1; i<nbCarte; i++){
            if(i<=13){
                cartesList.add(new Carte("Coeur", i));
            }
            if(i>13 && i<=26){
                cartesList.add(new Carte("Trefle", i - 13));
            }
            if(i>26 && i<=39){
                cartesList.add(new Carte("Carreau", i - 26));
            }
            if(i>39 && i<=52){
                cartesList.add(new Carte("Pique", i - 39));
            }
        }
        Collections.shuffle(cartesList);
    }
    
    @Override
    public String toString(){
        return cartesList.toString(); 
    }

    public Carte tireCartePaquet() {
        Carte carte = cartesList.get(0);
        cartesList.remove(0);
        return carte;
    }
}
