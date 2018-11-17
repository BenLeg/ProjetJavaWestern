/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package western;

/**
 *
 * @author legbe
 */
public class Sherif extends CowBoy{
    protected int nbBrigandCoffre;

    public Sherif(int nbBrigandCoffre, int popularite, String adjectif, String nom, String boissonFavorite) {
        super(popularite, adjectif, nom, boissonFavorite);
        this.nbBrigandCoffre = nbBrigandCoffre;
    }

    public int getNbBrigandCoffre() {
        return nbBrigandCoffre;
    }

    public void setNbBrigandCoffre(int nbBrigandCoffre) {
        this.nbBrigandCoffre = nbBrigandCoffre;
    }
    
    void coffrer(/*Brigand*/){
        
    }
    
    void rechercher(/*Brigand*/){
        
    }
    
    String quelEstTonNom(){
        /*methode super*/
        return "";
    }
    
    void sePresenter(){
        /*methode super*/
    }
}
