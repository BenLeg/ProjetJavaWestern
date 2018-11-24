package western;

/**
 * @author Benjamin Legrand et Loïc Tang
 */
public abstract class Humain {
    
    protected String nom;
    protected String boissonFavorite;
    
    public Humain(){
        nom = "inconnu(e)";
        boissonFavorite = "eau";
    }
    
    /**
     * Constructeur: classe Humain
     * @param nom
     * @param boissonFavorite
     */
    public Humain(String nom, String boissonFavorite) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
    }

    public String donneTonNom() {
        return nom;
    }

    public String donneTaBoissonFavorite() {
        return boissonFavorite;
    }

    public void parler(String phrase){
        System.out.println(nom +" : "+ phrase);
    }
    
    public static void controleSaisie(String parametre) throws SaisieVideException{
        if (parametre.isEmpty()){
            throw new SaisieVideException();
        }
        else{

        }
    }
 
}


