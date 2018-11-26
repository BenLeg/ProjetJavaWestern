package western;
import java.util.*;
/**
 *
 * @author Legrand Benjamin et Loic Tang
 */
public class Barman extends Humain {
    private final String nomBar;
    
    /**
     * Initialisation des parametres de la classe Barman
     */
    public Barman(){
        super();
        nomBar = "Zytho";
    }

    /**
     * Constructeur
     * @param nom
     * @param boissonFavorite
     * @param nomBar
     */
    public Barman(String nom, String boissonFavorite, String nomBar) {
        super(nom, boissonFavorite);
        this.nomBar = nomBar;
    }
    
    /**
     * Getter nomBar
     * @return nomBar
     */
    public String donneTonNomDeBar(){
        return nomBar;
    }
    
    /**
     * Methode pour servir un client
     * @param client
     */
    public void sert(Humain client){
        String boisson = "";
        Scanner input = new Scanner(System.in);
        
        try{
            parler(" Qu'est ce que je vous sert "+ client.donneTonNom() +" ?");
            boisson = input.nextLine(); 
            controleSaisie(boisson);
        }
        catch(SaisieException e){
            System.out.println(e.getMessage());
            sert(client);
        }
        parler("Et voilà votre verre de " + boisson + ".");
    }
    
    /**
     * Methode pour servir la boisson favorite d'un client
     * @param client
     */
    public void sertBoissonFavorite(Humain client){
        parler("Eh "+ client.nom +" ! Tiens la même chose que d'habitude, un bon verre de "+ client.boissonFavorite +".");
    }
    
    /**
     * Methode de présentation
     */
    public void sePresenter(){
        parler("Je suis "+ nom +" le barman du "+ nomBar +". J'apprécie un bon verre de "+ boissonFavorite +" après mon service.");
    }
}
