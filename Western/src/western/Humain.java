package western;

/**
 * @author Benjamin Legrand et Loïc Tang
 */
public abstract class Humain {
    
    protected String nom;
    protected String boissonFavorite;
    
    /**
     * Initialisation des parametres
     */
    public Humain(){
        nom = "inconnu(e)";
        boissonFavorite = "eau";
    }
    
    /**
     * Constructeur
     * @param nom
     * @param boissonFavorite
     */
    public Humain(String nom, String boissonFavorite) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
    }

    /**
     * Getters
     * @return
     */
    public String donneTonNom() {
        return nom;
    }

    public String donneTaBoissonFavorite() {
        return boissonFavorite;
    }

    /**
     * Méthode qui permet de faire parler un personnage
     * @param phrase
     */
    public void parler(String phrase){
        System.out.println(nom +" : "+ phrase);
    }
    
    /**
     * Méthode qui controle la saisie
     * @param saisie
     * @throws SaisieException
     */
    public static void controleSaisie(String saisie) throws SaisieException{
        if (saisie.isEmpty()){
            throw new SaisieException("ERREUR : Votre saisie est vide.");
        }
        else{

        }
    }
 
}


