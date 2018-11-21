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
public class DameDetresse extends Humain {
    private String etat;
    private String couleurRobe;

    public DameDetresse(String etat, String couleurRobe, String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
        this.etat = etat;
        this.couleurRobe = couleurRobe;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getCouleurRobe() {
        return couleurRobe;
    }

    public void setCouleurRobe(String couleurRobe) {
        this.couleurRobe = couleurRobe;
    }
    
    void seFaireEnlever(/*Brigand*/){
        
    }
    
    void seFaireLiberer(/*CowBoy*/){
        
    }
    
    void changerRobe(/*CowBoy*/){
        
    }
    
    String quelEstTonNom(){
        return"";
    }
    
    @Override
    void sePresenter(){
        System.out.println("");
    }
    
    @Override
    void parle(String phrase){
        System.out.println(phrase);
    }
}
