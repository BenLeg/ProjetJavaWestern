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
    
    private int popularite;
    private String adjectif;
    
    public CowBoy(){
        super();
        popularite = 8;
        adjectif = "inconnu";
    }
    
    public CowBoy(String nom, String boissonFavorite, int popularite, String adjectif) {
        super(nom, boissonFavorite);
        this.popularite = popularite;
        this.adjectif = adjectif;
    }
    
    public String donneTonAdjectif(){
        return adjectif;
    }
    
    public int donneTaPopularite(){
        return popularite;
    }
    
    public void sePresenter(){
        parler("Je suis le cowboy "+ nom +" le "+ adjectif +" et ce qu'il faut pour étancher ma soif c'est un verre de "+ boissonFavorite +".");
    }
    
    public void tirer(Brigand nomBrigand){
        System.out.println(nom +" a tiré sur "+ nomBrigand +".");
    }
    
    public void libererDame(DameDetresse nomDame){
        System.out.println(nom +" a libéré Lady "+ nomDame +".");
    }
    

    
}
