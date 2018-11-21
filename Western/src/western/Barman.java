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
public class Barman extends Humain {
    private String nomBar;

    public Barman(String nomBar, String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
        this.nomBar = nomBar;
    }

    public String getNomBar() {
        return nomBar;
    }

    public void setNomBar(String nomBar) {
        this.nomBar = nomBar;
    }
    
    void sert(/*Humain*/){
        
    }
    
    @Override
    void parle(String phrase){
        System.out.println(phrase);
    }
    
    @Override
    void sePresenter(){
        System.out.println("");
    }
}
