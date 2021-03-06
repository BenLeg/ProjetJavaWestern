package western;

/**
 *
 * @author Legrand Benjamin et Loic Tang
 */
public class Ripoux extends Sherif {
    private int nbDamesEnlevees;
    private int recompense;
    private String reputation;
    private Boolean estEnPrison;
    
    /**
     * Initialisation des parametres
     */
    public Ripoux(){
        super();
        nbDamesEnlevees = 0;
        recompense = 100;
        estEnPrison = false;
    }

    /**
     * Constructeur
     * @param nom
     * @param boissonFavorite
     * @param adjectif
     * @param popularite
     */
    public Ripoux(String nom, String boissonFavorite, String adjectif, int popularite) {
        super(nom, boissonFavorite, adjectif , popularite);
    }

    /**
     * Getters
     * @return
     */
    public int donneNbDameEnlevees() {
        return nbDamesEnlevees;
    }

    public int donneRecompense() {
        return recompense;
    }

    public Boolean esTuEnPrison() {
        return estEnPrison;
    }
    
    @Override
    public void sePresenter(){
        parler("Je suis "+ nom +". J'ai une réputation de "+ this.donneTonAdjectif() +" et ce qu'il faut pour étancher ma soif c'est un verre de "+ this.donneTaBoissonFavorite() +".");
    }
    
    /**
     *
     * @param dame
     */
    public void kidnapperDame(DameDetresse dame) {
        System.out.println(nom +" attrape "+ dame.nom +" et pose son pistolet sur sa tempe.");
        dame.seFaireEnlever(this);
        this.parler("Ne prononcez plus un mot et faites ce que je dis sinon j'appuie sur la détente.");
        nbDamesEnlevees = nbDamesEnlevees + 1;
        recompense = recompense * 2;
    }
    

    public void seFaireEmprisonner(){
        parler("NON ! Je me suis fait capturer, mais les barreaux de ma cellule ne me retiendont pas longtemps !");
        estEnPrison = true;
    }
    
}
