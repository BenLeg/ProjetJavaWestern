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
    
    public void initialisationPersonnages(){
        Barman carl = new Barman("Carl Moor","whisky","Saloon");
        listeBarmans.add(carl);
        Barman john = new Barman("John Bailey","eau de vie","Bailey Pub");
        listeBarmans.add(john);
        Barman louis = new Barman("Louis Hayes","bière blonde","Zytho");
        listeBarmans.add(louis);
        Sherif david = new Sherif("David Martinez","tequila","le vigoureux", 7);
        listeSherifs.add(david);
        Sherif alexandre = new Sherif("Alexandre Bryant","rhum blanc","le courageux", 9);
        listeSherifs.add(alexandre);
        Sherif martin = new Sherif("Martin Griffin","vin rouge","l'archarné", 6);
        listeSherifs.add(martin);
        Ripoux sam = new Ripoux("Sam Adams","rhum","magouilleur",4);
        listeRipoux.add(sam);
        Ripoux peter = new Ripoux("Peter Boyds","absinthe","fou",2);
        listeRipoux.add(peter);
        Ripoux henri = new Ripoux("Henri Mason","applejack","tricheur",3);
        listeRipoux.add(henri);
        DameDetresse suzanne = new DameDetresse("Suzanne Hill","champagne","heureuse","orange");
        listeDamesDetresse.add(suzanne);
        DameDetresse adele = new DameDetresse("Adèle Parker","limonade","distraite","vert pomme");
        listeDamesDetresse.add(adele);
        DameDetresse carmen = new DameDetresse("Carmen Rogers","rosé","calme","rose pâle");
        listeDamesDetresse.add(carmen);
        Brigand bill = new Brigand("Bill Pierce","bourbon","gachette facile", 120);
        listeBrigands.add(bill);
        Brigand rick = new Brigand("Rick Black","vodka","assassin", 750);
        listeBrigands.add(rick);
        Brigand jack = new Brigand("Jack Daniels","whisky","voleur", 370);
        listeBrigands.add(jack);
    }
    
    public void initialisationHistoire(){
        
        System.out.println("Vous pourrez incarner un courageux cowboy dans cette histoire à fin multiple.\nEn fonction de vos choix, vous accéderez aux fins suivantes:");
        for(FinsPossibles fin : FinsPossibles.values()){
            System.out.println(fin.donneDescription());
        }
        System.out.println("##################################################################################################");
        System.out.println("                                /Création personnage/");
        System.out.println("##################################################################################################");
        listeCowboys.add(creerPersonnage());
        listeCowboys.get(0).sePresenter();
        System.out.println();
        System.out.println("Vous entrez au bar "+ listeBarmans.get(0).donneTonNomDeBar() +".\n"
                + "Que decidez-vous de faire ?");
        switch(choixDeuxPossibilites("Aller au comptoir.","Jouer aux cartes.")){
            case "a":
                scriptComptoir();
                break;
            case "b":
                scriptJeuxCartes();
                break;
        }
    }
    
    public CowBoy creerPersonnage(){
        CowBoy personnage = null;
        
        System.out.println();
        String nom = saisie("Veuillez saisir le nom de votre personnage.");
        System.out.println();
        String boisson = saisie("Veuillez saisir la boisson préférée de votre personnage.");
        System.out.println();
        String adjectif = saisie("Veuillez saisir l'adjectif qui caractérise votre personnage.");
        
        personnage = new CowBoy(nom, boisson, 10, adjectif);
        return personnage;
    }
    
    public String saisie(String intitule){
        Scanner input = new Scanner(System.in);
        String motSaisi = "";
        
        try{
            System.out.println(intitule);
            motSaisi = input.nextLine();
            Humain.controleSaisie(motSaisi);
        }catch(SaisieException e){
            System.out.println("-----------------------------------------------");
            System.out.println(e.getMessage());
            System.out.println("-----------------------------------------------");
            System.out.println("Nouvelle tentative.");
            motSaisi = saisie(intitule);
        }
        
        return motSaisi;
    }

    public int aleatoire(int nombre){
        Random random = new Random();
        return random.nextInt(nombre);
    }
    
    public String tir(){
        String resultat = "";
        switch(aleatoire(2)){
            case 0:
                resultat = "mort";
                break;
            case 1:
                resultat = "blessure";
                break;
            case 2:
                resultat = "raté";
                break;
        }
        return resultat;
    }
    
    public String choixDeuxPossibilites(String intituleA,String intituleB){
        String reponse;
        System.out.println("Un choix s'impose:");
        System.out.println("a. "+ intituleA);
        System.out.println("Ou");
        System.out.println("b. "+ intituleB);
        System.out.println();
        reponse = saisie("Veuillez saisir a ou b.");
        while(true){
            if( reponse.equals("a") || reponse.equals("b")){
                return reponse;
            }
            else{
                reponse = saisie("Veuillez saisir uniquement entre a ou b.");
            }
        }
    }
    
    public String choixTroisPossibilites(String intituleA,String intituleB,String intituleC){
        String reponse;
        System.out.println("Un choix s'impose:");
        System.out.println("    a. "+ intituleA);
        System.out.println("Ou");
        System.out.println("    b. "+ intituleB);
        System.out.println("Ou");
        System.out.println("    c. "+ intituleC);
        System.out.println();
        reponse = saisie("Veuillez saisir a ou b ou c.");
        while(true){
            if( reponse.equals("a") || reponse.equals("b") || reponse.equals("c")){
                return reponse;
            }
            else{
                reponse = saisie("Veuillez saisir uniquement a ou b ou c.");
            }
        }
    }
    

    public void scriptComptoir(){
        System.out.println("Vous vous dirigez en direction du bar, prenez place devant celui-ci.");
        System.out.println("* Le barman vous adresse la parole *");
        listeBarmans.get(1).sePresenter();
        listeBarmans.get(0).parler("A qui ai-je l'honneur ?");
        listeCowboys.get(0).sePresenter();    
        listeBarmans.get(0).sert(listeCowboys.get(0));
        System.out.println("Vous remerciez le barman et buvez tranquillement votre verre.");
        switch(aleatoire(2)){
            case 0:
                scriptProvocation();
                break;
            case 1:
                scriptKidnapping();
                break;
        }
    }
    
    public void scriptProvocation(){
        
        System.out.println("Un inconnu s'approche de vous, il vous bouscule et vous provoque en duel.");
        switch(choixDeuxPossibilites("Vous acceptez le duel.","Vous préférez rester au comptoir")){
            case "a":
                scriptDuel();
                break;
            case "b":
                scriptComptoir();
                break;
        }
    }
    
    public void scriptKidnapping(){
        System.out.println("Script pas encore écrit.");
    }
    
    public void scriptDuel(){
        listeCowboys.get(0).parler("J'accepte votre duel ! Dirigeons nous vers la sortie que l'on règle cette histoire au plus vite !");
        System.out.println("Vous vous dirigez tous les deux vers la sortie du "+listeBarmans.get(0).donneTonNomDeBar()+".");
        System.out.println("Le Sherif "+ listeSherifs.get(0).donneTonNom() +" dirige le duel.");
        listeSherifs.get(0).parler("Mettez vous dos à dos. Puis faites un pas à chaque fois que je compterai.\n "
                + "Quand j'arriverai à dix vous pourrez degainer et tirer sur votre adversaire.\n"
                + "Le gagnant sera celui qui restera en vie à la fin de ce duel.\n"
                + "Vous êtes prêt ?");
        listeRipoux.get(0).parler("OUI !");
        listeCowboys.get(0).parler("OUI !");
        listeSherifs.get(0).parler("Que le duel commence !");
        for(int i = 1; i<11; i++){
            listeSherifs.get(0).parler(i +" !");
        }
        System.out.println("Deux tirs retentissent.");
        switch(aleatoire(2)){
            case 0:
                System.out.println(listeRipoux.get(0).donneTonNom()+" s'écroule.\n"
                        + "Vous avez été le plus précis, vous gagnez le duel !");
                finHistoire(8);
                break;
            case 1:
                System.out.println("Une sensation froide envahit votre être, vous êtes touché. \n "
                        + "Vous perdez connaissance et mourrez au milieu de la rue.");
                finHistoire(9);
                break;
        }
    }
    
    public void scriptJeuxCartes(){
        System.out.println("Vous vous dirigez vers la table de jeux.");
        System.out.println("Ecrire la suite");
    }
    
    public void finHistoire(int numeroFin){
        System.out.println("============================");
        System.out.println("Fin de l'histoire, vous avez débloqué la:");
        switch(numeroFin){
            case 1:
                System.out.println(FinsPossibles.Fin1.donneDescription());
                break;
            case 2:
                System.out.println(FinsPossibles.Fin2.donneDescription());
                break;
            case 3:
                System.out.println(FinsPossibles.Fin3.donneDescription());
                break;
            case 4:
                System.out.println(FinsPossibles.Fin4.donneDescription());
                break;
            case 5:
                System.out.println(FinsPossibles.Fin5.donneDescription());
                break;
            case 6:
                System.out.println(FinsPossibles.Fin6.donneDescription());
                break;
            case 7:
                System.out.println(FinsPossibles.Fin7.donneDescription());
                break;
            case 8:
                System.out.println(FinsPossibles.Fin8.donneDescription());
                break;
            case 9:
                System.out.println(FinsPossibles.Fin9.donneDescription());
                break;
            case 10:
                System.out.println(FinsPossibles.Fin10.donneDescription());
                break;
        }
        System.out.println("============================");
        revivreHistoire();
    }
    
    public void revivreHistoire(){
        System.out.println("Voulez vous revivre l'histoire pour découvrir d'autres fins ?");
        switch(choixDeuxPossibilites("Oui, je veux revivre l'histoire.","Non, je souhaite en rester la.")){
            case "a":
                initialisationHistoire();
                break;
            case "b":
                System.out.println("J'espère que l'expérience de lecture fut intéressante.");
        }
    }
}


