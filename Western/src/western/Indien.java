package western;

/**
 *
 * @author Legrand Benjamin et Loic Tang
 */
public class Indien extends Humain {
    private int nbPlumes;
    private String totem;
    
    /**
     * Initialisation des parametres
     */
    public Indien(){
        nbPlumes = 0;
        totem = "le saumon";
    }
    
    /**
     * Constructeur
     * @param nbPlumes
     * @param totem
     * @param nom
     * @param boissonFavorite
     */
    public Indien(int nbPlumes, String totem, String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
        this.nbPlumes = nbPlumes;
        this.totem = totem;
    }

    /**
     *  getters
     * @return
     */
    public int getNbPlumes() {
        return nbPlumes;
    }

    public String getTotem() {
        return totem;
    }

    
    void sePresenter(){
        parler("Je suis "+ nom +" l'indien, mon totem est "+ totem +". Je suis paré de mes "+ nbPlumes +" plus belles plumes ." );
    }
}
