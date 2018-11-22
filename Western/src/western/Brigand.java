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
public class Brigand extends Humain {
    private int nbDameEnlevees;
    private int recompense;
    private String reputation;
    private Boolean estEnPrison;
    
    public Brigand(){
        nbDameEnlevees = 0;
        recompense = 0;
        reputation = "inconnue";
        estEnPrison = false;
    }

    public Brigand(int nbDameEnlevees, int recompense, String reputation, Boolean estEnPrison, String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
        this.nbDameEnlevees = nbDameEnlevees;
        this.recompense = recompense;
        this.reputation = reputation;
        this.estEnPrison = estEnPrison;
    }

    public int getNbDameEnlevees() {
        return nbDameEnlevees;
    }

    public void setNbDameEnlevees(int nbDameEnlevees) {
        this.nbDameEnlevees = nbDameEnlevees;
    }

    public int getRecompense() {
        return recompense;
    }

    public void setRecompense(int recompense) {
        this.recompense = recompense;
    }

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }

    public Boolean getEstEnPrison() {
        return estEnPrison;
    }

    public void setEstEnPrison(Boolean estEnPrison) {
        this.estEnPrison = estEnPrison;
    }
    
    void echapper(String debutPhrase, String finPhrase){
        System.out.println(debutPhrase + nom + finPhrase); 
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
