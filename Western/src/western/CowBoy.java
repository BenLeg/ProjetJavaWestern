/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package western;

/**
 *
 * @author Legrand Benjamin et Loic Tang
 */
public class CowBoy extends Humain {
    
    private int popularite;
    private String adjectif;
    
    /**
     * Initiaisation des parametres de la classe CowBoy
     */
    public CowBoy(){
        super();
        popularite = 8;
        adjectif = "inconnu";
    }
    
    /**
     *  Constructeur
     * @param nom
     * @param boissonFavorite
     * @param popularite
     * @param adjectif
     */
    public CowBoy(String nom, String boissonFavorite, int popularite, String adjectif) {
        super(nom, boissonFavorite);
        this.popularite = popularite;
        this.adjectif = adjectif;
    }
    
    /**
     * Getters
     * @return
     */
    public String donneTonAdjectif(){
        return adjectif;
    }
    public int donneTaPopularite(){
        return popularite;
    }
    
    /**
     * Méthode pour se présenter
     */
    public void sePresenter(){
        parler("Je suis le cowboy "+ nom +" le "+ adjectif +".");
    }
    
    /**
     *  Méthode qui annonce que l'on tire sur un brigand
     * @param nomBrigand
     */
    public void tirer(Brigand nomBrigand){
        System.out.println(nom +" a tiré sur "+ nomBrigand +".");
    }
    
    /**
     * Méthode qui annonce que l'on a libéré une dame en detresse
     * @param nomDame
     */
    public void libererDame(DameDetresse nomDame){
        System.out.println(nom +" a libéré Lady "+ nomDame +".");
    }
    

    
}
