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
    
    public CowBoy(){
        super();
        popularite = 0;
        adjectif = "normal";
    }
    
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
      
    void tirer(Brigand nomBrigand){
        System.out.println(nom +" a tiré sur "+ nomBrigand +".");
    }
    
    void libererDame(DameDetresse nomDame){
        System.out.println(nom +" a libéré Lady "+ nomDame +".");
    }
    
    @Override
    void sePresenter(String debutPhrase, String finPhrase){
        System.out.println(debutPhrase + nom + finPhrase);
    }
    
    @Override
    void parle(String phrase){
        System.out.println(phrase);
    }


}
