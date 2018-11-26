package western;

/**
 *
 * @author Legrand Benjamin et Loic Tang
 */
public class Sherif extends CowBoy{
    protected int nbBrigandCoffre;
    
    /**
     * Initialisation des parametres
     */
    public Sherif(){
        super();
        nbBrigandCoffre = 27;
    }

    /**
     * Constructeur
     * @param nom
     * @param adjectif
     * @param boissonFavorite
     * @param popularite
     */
    public Sherif(String nom, String adjectif, String boissonFavorite, int popularite) {
        super(nom, boissonFavorite, popularite, adjectif);
    }

    /**
     * Getters
     * @return
     */
    public int donneNbBrigandCoffre() {
        return nbBrigandCoffre;
    }

    public void setNbBrigandCoffre(int nbBrigandCoffre) {
        this.nbBrigandCoffre = nbBrigandCoffre;
    }
    
    @Override
    public void sePresenter(){
        parler("Je suis le Sherif de cette ville, connu sous le nom de "+ nom +" "+ this.donneTonAdjectif() +" et ce qu'il faut pour étancher ma soif c'est un verre de "+ boissonFavorite +".");
    }
    
    /**
     *
     * @param nomBrigand
     */
    public void coffrer(Brigand nomBrigand){
        System.out.println("J'ai fini pas mettre "+ nomBrigand +" sous les verrous !");
        nbBrigandCoffre = nbBrigandCoffre + 1;
    }


}
