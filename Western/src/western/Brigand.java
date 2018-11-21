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
    private String look;
    private Boolean estEnPrison;

    public Brigand(int nbDameEnlevees, int recompense, String look, Boolean estEnPrison, String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
        this.nbDameEnlevees = nbDameEnlevees;
        this.recompense = recompense;
        this.look = look;
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

    public String getLook() {
        return look;
    }

    public void setLook(String look) {
        this.look = look;
    }

    public Boolean getEstEnPrison() {
        return estEnPrison;
    }

    public void setEstEnPrison(Boolean estEnPrison) {
        this.estEnPrison = estEnPrison;
    }
    
    void echapper(){
        System.out.println("Il ne m'a pas fallu beaucoup de temps pour m'échapper, personne ne retient "+ nom +" en cellule."); 
    }
    
    String quelEstTonNom(){
        return "";
    }
    
    @Override
    void sePresenter(){
        System.out.println("Je suis "+ nom +" le criminel le plus recherché de l'Etat.");
    }
    
    void parle(String phrase){
        System.out.println(phrase);
    }
    
}
