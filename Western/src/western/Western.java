package western;

/**
 *
 * @author Legrand Benjamin et Loic Tang
 */
public class Western {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CowBoy fred = new CowBoy("fred","biere",10,"bonne");
        System.out.println("++"+fred.nom);
        
        Histoire histoire = new Histoire();
        histoire.initialisationPersonnages();
        histoire.initialisationHistoire();

    }
    
}
