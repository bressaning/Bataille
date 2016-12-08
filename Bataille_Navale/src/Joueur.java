/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author licence
 */
public class Joueur {
    
    private int compteurPts;
    private Paquet paquet;
    private String nom;
    
    public Joueur(String nomJ){
        nom = nomJ;
        compteurPts = 0;
        paquet = new Paquet();
    }
      
    public Carte tireCarte(){
        return paquet.tireCartePaquet();
    }
    
    public void gagnerUnPoint(){
        compteurPts++;
    }
    
    public int getPoint(){
        return compteurPts;
    }
}
