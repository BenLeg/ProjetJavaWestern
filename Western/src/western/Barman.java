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
    
    public void sert(Humain client){
        String boisson;
        Scanner input = new Scanner(System.in);
        
        try{
            parler("Salut "+ client.donneTonNom() +". Qu'est ce que je te sert ?");
            boisson = input.nextLine(); 
            Humain.verificationSaisie(boisson);
            parler("Et voilà ton verre de " + boisson + ".");
        }
        catch(SaisieException be){
            System.out.println(be.getMessage());
            sert(client);
        }
    }
    
    public void sertBoissonFavorite(Humain client){
        parler("Eh "+ client.nom +" ! Tiens la même chose que d'habitude, un bon verre de "+ client.boissonFavorite +".");
    }
    
    public void sePresenter(){
        parler("Je suis "+ nom +" le barman du "+ nomBar +". J'apprécie un bon verre de "+ boissonFavorite +" après mon service.");
    }
}
