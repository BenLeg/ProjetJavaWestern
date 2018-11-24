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
public class Indien extends Humain {
    private int nbPlumes;
    private String totem;
    
    public Indien(){
        nbPlumes = 0;
        totem = "le saumon";
    }
    
    public Indien(int nbPlumes, String totem, String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
        this.nbPlumes = nbPlumes;
        this.totem = totem;
    }

    public int getNbPlumes() {
        return nbPlumes;
    }

    public void setNbPlumes(int nbPlumes) {
        this.nbPlumes = nbPlumes;
    }

    public String getTotem() {
        return totem;
    }

    public void setTotem(String totem) {
        this.totem = totem;
    }
    
    void sePresenter(){
        parler("Je suis "+ nom +" l'indien, mon totem est "+ totem +". Je suis paré de mes "+ nbPlumes +" plus belles plumes ." );
    }
}
