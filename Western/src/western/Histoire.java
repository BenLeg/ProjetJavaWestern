package western;
import java.util.*;
/**
 *
 * @author legbe
 */
public class Histoire {
    
    protected ArrayList <CowBoy> listeCowboys = new ArrayList <>();
    protected ArrayList <Brigand> listeBrigands = new ArrayList <>();
    protected ArrayList <DameDetresse> listeDamesDetresse = new ArrayList <>();
    protected ArrayList <Indien> listeIndiens = new ArrayList <>();
    protected ArrayList <Sherif> listeSherifs = new ArrayList <>();
    protected ArrayList <Ripoux> listeRipoux = new ArrayList <>();
    protected ArrayList <Barman> listeBarmans = new ArrayList <>();
    
    public void initialisationPersonnage(){
        Barman carl = new Barman("Carl Moor","whisky","le Saloon");
        listeBarmans.add(carl);
        Sherif david = new Sherif("David Martinez","tequila","le vigoureux", 7);
        listeSherifs.add(david);
        Ripoux sam = new Ripoux("Sam Adams","rhum","magouilleur",4);
        
        
    }
}
