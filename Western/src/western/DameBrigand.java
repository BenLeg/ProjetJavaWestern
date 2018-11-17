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
public class DameBrigand extends DameDetresse {
    private int nbDameEnlevees;
    private int recompense;
    private String look;
    private Boolean estEnPrison;

    public DameBrigand(int nbDameEnlevees, int recompense, String look, Boolean estEnPrison, String etat, String couleurRobe, String nom, String boissonFavorite) {
        super(etat, couleurRobe, nom, boissonFavorite);
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
    
    
}
