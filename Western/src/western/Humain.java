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
public class Humain {
    protected String nom;
    protected String boissonFavorite;

    public Humain(String nom, String boissonFavorite) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBoissonFavorite() {
        return boissonFavorite;
    }

    public void setBoissonFavorite(String boissonFavorite) {
        this.boissonFavorite = boissonFavorite;
    }
    
    void parle(String phrase){
        System.out.println(phrase);
    }
    
    void sePresenter(){
        System.out.println("Bonjour, je suis "+ nom +".");
    }
    

}
