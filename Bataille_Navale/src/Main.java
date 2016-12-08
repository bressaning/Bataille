/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author licence
 */
public class Main {
    public static void main(String[] args){
        Joueur j1 = new Joueur("Papa");
        Joueur j2 = new Joueur("Maman");
        
        for(int i = 0; i < 52; i++){
            Carte c1 = j1.tireCarte();
            Carte c2 = j2.tireCarte();

            System.out.println(c1.toString());
            System.out.println(c2.toString());

            if(c1.compareTo(c2)){
                j1.gagnerUnPoint();
            }
            else{
                j2.gagnerUnPoint();
            }
        }
        System.out.println(j1.getPoint());
        System.out.println(j2.getPoint());
    }
    
}
