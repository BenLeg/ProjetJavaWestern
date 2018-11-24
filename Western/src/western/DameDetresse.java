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
    private Boolean estEnlevee = false;
    
    public DameDetresse(){
        super();
        etat = "joyeuse";
        couleurRobe = "rouge";
    }

    public DameDetresse(String nom, String boissonFavorite, String etat, String couleurRobe) {
        super(nom, boissonFavorite);
        this.etat = etat;
        this.couleurRobe = couleurRobe;
    }

    public String donneTonEtat() {
        return etat;
    }

    public String donneCouleurRobe() {
        return couleurRobe;
    }

    public Boolean esTuEnlevee() {
        return estEnlevee;
    }
    
    void seFaireEnlever(Humain kidnappeur){
        etat = "en danger";
        parler("AU SECOOOUURS !! \nJe suis "+ etat +", "+ kidnappeur.nom +" me kidnappe !");
        estEnlevee = true;
    }
    
    void seFaireLiberer(CowBoy sauveur){
        parler(sauveur.nom +"vous êtes un héro, vous m'avez sauvé la vie ! \nMerci de m'avoir libérée !");
        estEnlevee = false;
    }
    
    void changerRobe(CowBoy cowboy, String couleur){
        System.out.println("* "+ nom +" a changé de robe *");
        parler("Regardez "+ cowboy.nom +" j'ai changé de robe rien que pour toi !");
        cowboy.parler("Vous êtes très séduisante, le "+ couleur +" vous va à ravir.");
        couleurRobe = couleur;
    }
    
    public void sePresenter(){
        parler("Bonjour, je suis "+ nom +", je porte une robe "+ couleurRobe +". J'aime de tant en tant boire un petit verre de "+ boissonFavorite +".");
    }

}
