package western;

/**
 *
 * @author Legrand Benjamin et Loic Tang
 */
public enum FinsPossibles {
    


    /**
     * Enumeration de toutes les fins possibles
     */
    
    /* Fin 1 */
    Fin1("Fin n°1 : Trop courageurx"),
    /* Fin 2 */
    Fin2("Fin n°2 : Nul en tir"),
    /* Fin 3 */
    Fin3("Fin n°3 : Trop lent"),
    /* Fin 4 */
    Fin4("Fin n°4 : Tireur d'élite"),
    /* Fin 5 */
    Fin5("Fin n°5 : Romantique"),
    /* Fin 6 */
    Fin6("Fin n°6 : Leader"),
    /* Fin 7 */
    Fin7("Fin n°7 : Aventurier"),
    /* Fin 8 */
    Fin8("Fin n°8 : Génie de la gachette"),
    /* Fin 9 */
    Fin9("Fin n°9 : Dernier duel"),
    /* Fin 10 */
    Fin10("Fin n°10 : Scalpé");

    private final String description ;

    /**
     * getter 
     * @return
     */
    public String donneDescription() {
        return description;
    }
    
    /**
     * Constructeur
     */
    FinsPossibles(String description){
        this.description = description ;
    }
}
