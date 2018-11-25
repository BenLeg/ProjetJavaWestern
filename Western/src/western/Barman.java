package western;
import java.util.*;
/**
 *
 * @author legbe
 */
public class Barman extends Humain {
    private String nomBar;
    
    public Barman(){
        super();
        nomBar = "Zytho";
    }

    public Barman(String nom, String boissonFavorite, String nomBar) {
        super(nom, boissonFavorite);
        this.nomBar = nomBar;
    }
    
    public String donneTonNomDeBar(){
        return nomBar;
    }
    
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
    
    public void sertBoissonFavorite(Humain client){
        parler("Eh "+ client.nom +" ! Tiens la même chose que d'habitude, un bon verre de "+ client.boissonFavorite +".");
    }
    
    public void sePresenter(){
        parler("Je suis "+ nom +" le barman du "+ nomBar +". J'apprécie un bon verre de "+ boissonFavorite +" après mon service.");
    }
}
