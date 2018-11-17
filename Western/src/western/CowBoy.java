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
public class CowBoy extends Humain {
    protected int popularite;
    protected String adjectif;
    
    public CowBoy(int popularite, String adjectif, String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
        this.popularite = popularite;
        this.adjectif = adjectif;
    }  

    public int getPopularite() {
        return popularite;
    }

    public void setPopularite(int popularite) {
        this.popularite = popularite;
    }

    public String getAdjectif() {
        return adjectif;
    }

    public void setAdjectif(String adjectif) {
        this.adjectif = adjectif;
    }
      
    void tirer(/*Brigand*/){
        
    }
    
    void libererDame(/*Dame*/){
        
    }
    
    void sePresenter(){
        /*Utiliser la méthode super.sePresenter*/
    }


}
