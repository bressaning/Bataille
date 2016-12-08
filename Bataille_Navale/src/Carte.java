/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author licence
 */
public class Carte {
    private String couleur;
    private int numero;
    
    public String getCouleur(){
        return couleur;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String afficher()    {
        return couleur+" "+numero;
    }
    
    public Carte(String couleur2, int numero2){
        couleur= couleur2;
        numero= numero2;
    }
    
    @Override
    public String toString(){
        return couleur+" "+numero;
        
    }
    
    public boolean compareTo(Carte c2){
        //c1.compareTo(c2);
        Carte c1 = this;
        if(c1.numero > c2.numero){
            return true;
        }
        return false;
    }
}
