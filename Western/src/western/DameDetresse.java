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
    private Couleur couleurRobe;
    
    public DameDetresse(){
        super();
        etat = "calme";
        couleurRobe = Couleur.ROUGE;
    }

    public DameDetresse(String etat, Couleur couleurRobe, String nom, String boissonFavorite) {
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

    public Couleur getCouleurRobe() {
        return couleurRobe;
    }

    public void setCouleurRobe(Couleur couleurRobe) {
        this.couleurRobe = couleurRobe;
    }
    
    void seFaireEnlever(String debutPhrase, String milieuPhrase, String finPhrase, Brigand kidnappeur){
        System.out.println(debutPhrase + kidnappeur.nom + milieuPhrase + nom + finPhrase);
    }
    
    void seFaireLiberer(String debutPhrase, String milieuPhrase, String finPhrase,CowBoy sauveur){
        System.out.println(debutPhrase + sauveur.nom + milieuPhrase + nom + finPhrase);
    }
    
    void changerRobe(String debutPhrase, String milieuPhrase, String finPhrase,CowBoy cowboy){
        System.out.println(debutPhrase + cowboy.nom + milieuPhrase + nom + finPhrase);
    }
    
    /* A reflechir sur l'utilité de la methode
    String quelEstTonNom(){
        return"";
    }*/
    
    @Override
    void sePresenter(String debutPhrase, String finPhrase){
        System.out.println(debutPhrase + nom + finPhrase);
    }
    
    @Override
    void parle(String phrase){
        System.out.println(phrase);
    }
}
