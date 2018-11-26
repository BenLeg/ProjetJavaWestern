package western;

/**
 *
 * @author Legrand Benjamin et Loic Tang
 */
public class Brigand extends Humain implements HorsLaLoi{
    private int nbDameEnlevees;
    private final int recompense;
    private final String reputation;
    private Boolean estEnPrison;
    private Boolean estVivant;
    
    /**
     * Initialisation des parametres Brigands
     */
    public Brigand(){
        nbDameEnlevees = 0;
        recompense = 100;
        reputation = "inconnue";
        estEnPrison = false;
        estVivant = true;
    }
    
    /**
     * Constructeur
     * @param nom
     * @param boissonFavorite
     * @param reputation
     * @param recompense
     */
    public Brigand(String nom, String boissonFavorite, String reputation, int recompense) {
        super(nom, boissonFavorite);
        this.reputation = reputation;
        this.recompense = recompense;
    }

    /**
     * Getters
     * @return
     */
    public int donneNbDameEnlevees() {
        return nbDameEnlevees;
    }
    public int donneTaRecompense() {
        return recompense;
    }
    public String donneTaReputation() {
        return reputation;
    }

    void sePresenter(){
        parler("Je suis "+ nom +" il faut pas m'enerver. J'ai une réputation de "+ reputation +".");
    }
    
    /**
     * Methode pour kidnapper une dame en detresse
     * @param dame
     */
    @Override
    public void kidnapperDame(DameDetresse dame){
        System.out.println(nom +" attrape "+ dame.nom +" et pose son pistolet sur sa tempe.");
        dame.seFaireEnlever(this);
        this.parler("Ne prononcez plus un mot et faites ce que je dis sinon j'appuie sur la détente.");
    }
    
    /**
     * Methode pour annoncer qu'on est emprisonné
     */
    @Override
    public void seFaireEmprisonner(){
        parler("NON ! Je me suis fait capturer, mais les barreaux de ma cellule ne me retiendont pas longtemps !");
        estEnPrison = true;
    }
}
