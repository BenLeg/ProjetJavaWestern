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
public class Brigand extends Humain implements HorsLaLoi{
    private int nbDameEnlevees;
    private int recompense;
    private String reputation;
    private Boolean estEnPrison;
    private Boolean estVivant;
    
    public Brigand(){
        nbDameEnlevees = 0;
        recompense = 100;
        reputation = "inconnue";
        estEnPrison = false;
        estVivant = true;
    }
    
    public Brigand(String nom, String boissonFavorite, String adjectif, String reputation) {
        super(nom, boissonFavorite);
        this.reputation = reputation;
    }

    public int donneNbDameEnlevees() {
        return nbDameEnlevees;
    }

    public int donneTaRecompense() {
        return recompense;
    }

    public String donneTaReputation() {
        return reputation;
    }

    public Boolean esTuEnPrison() {
        return estEnPrison;
    }

    public Boolean esTuVivant() {
        return estVivant;
    }

    void sePresenter(){
        parler("Je suis "+ nom +" le plus grand criminel de cette ville. J'ai une réputation de "+ reputation +" et ce qu'il faut pour étancher ma soif c'est un verre de "+ this.donneTaBoissonFavorite() +".");
    }
    
    @Override
    public void kidnapperDame(DameDetresse dame){
        System.out.println(nom +" attrape "+ dame.nom +" et pose son pistolet sur sa tempe.");
        dame.seFaireEnlever(this);
        this.parler("Ne prononcez plus un mot et faites ce que je dis sinon j'appuie sur la détente.");
    }
    
    @Override
    public void seFaireEmprisonner(){
        parler("NON ! Je me suis fait capturer, mais les barreaux de ma cellule ne me retiendont pas longtemps !");
        estEnPrison = true;
    }
}
