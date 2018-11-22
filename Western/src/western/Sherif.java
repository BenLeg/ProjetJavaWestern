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
    
    public Sherif(){
        super();
        nbBrigandCoffre = 0;
    }

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
    
    void coffrer(Brigand nomBrigand){
        System.out.println("J'ai fini pas mettre "+ nomBrigand +" sous les verrous de ma cellule.");
    }
    
    void rechercher(Brigand nomBrigand){
        System.out.println(nom +" a encore commis un crime, je pars à sa recherche.");
    }
    
    /* A reflechir sur l'utilité
    String quelEstTonNom(){
        return "";
    }
    */
    @Override
    void sePresenter(String debutPhrase, String finPhrase){
        System.out.println(debutPhrase + nom + finPhrase);
    }
    
    @Override
    void parle(String phrase){
        System.out.println(phrase);
    }
}
