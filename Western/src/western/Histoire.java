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
        Ripoux sam = new Ripoux("Sam Adams","rhum","magouilleur",4);
        listeRipoux.add(sam);
        Ripoux peter = new Ripoux("Peter Boyds","absinthe","fou",2);
        listeRipoux.add(peter);
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
        Indien po = new Indien(3, "ours", "Po", "eau de source");
        listeIndiens.add(po);
        Indien yakari = new Indien(5, "bison", "Yakari", "eau de la rivière");
        listeIndiens.add(yakari);
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
        listeBrigands.get(0).sePresenter();
        listeBrigands.get(0).parler("Et toi ta tête ne me reviens pas, j'ai bien envie de te refaire le portrait dans un duel au pistolet.");
        switch(choixDeuxPossibilites("Vous acceptez le duel.","Vous préférez rester au comptoir")){
            case "a":
                scriptDuel(0);
                break;
            case "b":
                scriptComptoir();
                break;
        }
    }
    
    public void scriptKidnapping(){
        int nombre = aleatoire(3);
        listeBrigands.get(2).kidnapperDame(listeDamesDetresse.get(nombre));
        System.out.println(listeBrigands.get(2).donneTonNom() +" sort du bar et prend la fuite en direction du desert.\n"
                + "Vous décidez de le poursuivre, quand vous sortez le Sherif annonce.");
        listeSherifs.get(1).parler("Celui qui ramène "+ listeBrigands.get(2).donneTonNom() +" mort ou vif recevra une récompense de "+ listeBrigands.get(2).donneTaRecompense() +".");
        System.out.println("Vous sautez sur votre fidèle destrier, cependant ils sont déjà loin.\n"
                + "Vous connaissez un surplomb du quel vous pourrez tenter un tir en direction du brigand en fuite.");
        switch(choixDeuxPossibilites("Vous decidez de rester dans les traces de "+ listeBrigands.get(2).donneTonNom() +".","Vous choississez la direction du surplomb.")){
            case "a":
                scriptPoursuite(nombre);
                break;
            case "b":
                scriptSurplomb(nombre);
                break;
        }
    }
    
    public void scriptSurplomb(int nombre){
        System.out.println("Vous prenez le chemin du surplomb.");
        switch(aleatoire(2)){
            case 0:
                System.out.println("Malheureusement vous tomber sur un groupe d'indien");
                listeIndiens.get(0).sePresenter();
                listeIndiens.get(1).sePresenter();
                System.out.println("Vous venez de rentrer sur leurs terres et décident de vous scalper.");
                finHistoire(10);
            case 1:
                System.out.println("Vous arrivez au surplomb sans problème.\n"
                        + "Vous appercevez au loin le brigand sur son cheval.\n"
                        + "Vous n'aurez que la possibilité de réaliser un tir, vous vous concentrez.");
                scriptTir(nombre);
        }
    }
    
    public void scriptPoursuite(int nombre){
        System.out.println("Vous avez décidé de rester derrière  le criminel en fuite.\n"
                + "Vous vous rapprochez au fur et à mesure de la poursuite.\n"
                + "Vous avez l'occasion de tirer cependant vous risquez de toucher "+ listeDamesDetresse.get(nombre).donneTonNom()+".\n"
                        + "Que décidez vous ?");
        switch(choixDeuxPossibilites("Vous decidez de tirer","Vous decidez de continuer la pourquite et de rattraper"+ listeBrigands.get(2).donneTonNom() +".")){
            case "a":
                scriptTir(nombre);
                break;
            case "b":
                scriptPasTirePoursuite(nombre);
                break;
        }
    }
    
    public void scriptPasTirePoursuite(int nombre){
        switch(aleatoire(2)){
            case 0:
                scriptFuite();
                break;
            case 1:
                scriptRattraper(nombre);
        }
    }
    
    public void scriptRattraper(int nombre){
        System.out.println("Vous finissez par les rattraper, "+ listeBrigands.get(2).donneTonNom() +" pointe son arme sur vous.");
        switch(aleatoire(2)){
            case 0:
                System.out.println("Il vous tire dessus, vous êtes touché et mourrez.");
                finHistoire(1);
                break;
            case 1:
                scriptSeRendre(nombre);
        }
    }
    
    public void scriptSeRendre(int nombre){
        System.out.println(listeDamesDetresse.get(nombre).donneTonNom() +" l'empeche de tirer, son arme tombe.\n"
                + "Vous pointez votre arme à votre tour.");
        listeCowboys.get(0).parler("REND TOI !");
        listeBrigands.get(2).parler("D'accord.");
        listeCowboys.get(0).libererDame(listeDamesDetresse.get(nombre));
        System.out.println("Vous retournez en ville.");
        scriptHistoireAmour(nombre);
        
    }
    
    public void scriptTir(int nombre){
        System.out.println("Vous saisissez votre arme, alignez votre visée.");
        listeCowboys.get(0).tirer(listeBrigands.get(2));
        switch(aleatoire(3)){
            case 0:
                scriptMort(nombre);
                break;
            case 1:
                System.out.println("Vous ratez votre tire et celui-ci vous déséquilibre.");
                listeCowboys.get(0).parler("NOOOOOON !!");
                scriptFuite();
            case 2:
                scriptBlessure(nombre);
                
        }
    }
    
    public void scriptBlessure(int nombre){
        System.out.println("Vous avez blessé le brigand, il ne parvient pas à s'enfuir et vous le capturez.\n"
                + "Vous l'amenez au Sherif.");
        listeSherifs.get(1).coffrer(listeBrigands.get(2));
        listeBrigands.get(2).seFaireEmprisonner();
        switch(choixDeuxPossibilites("Raccompagner "+ listeDamesDetresse.get(nombre).donneTonNom() +".","Aller voir le Sherif "+ listeSherifs.get(1).donneTonNom() +".")){
            case "a":
                scriptHistoireAmour(nombre);
                break;
            case "b":
                scriptDiscussionSherif();
                break;
        }
    }
    
    public void scriptDiscussionSherif(){
        System.out.println("Vous vous approchez du Sherif.");
        listeSherifs.get(1).sePresenter();
        listeSherifs.get(1).parler("J'ai mis "+ listeSherifs.get(1).donneNbBrigandCoffre() +"criminel en cellule lors de ma longue carrière.\n C'est le moment de penser à la relève, veux-tu devenir le nouveau Sherif de cette ville ?");
        switch(choixDeuxPossibilites("Accepter la proposition de "+ listeSherifs.get(1).donneTonNom() +".","Refuser et retourner traverser le desert en solitaire.")){
            case "a":
                System.out.println("Vous avez décidé de venir le nouveau Sherif de la ville.");
                finHistoire(6);
                break;
            case "b":
                System.out.println("Vous avez décidé de poursuivre votre aventure solitaire à travers le désert.");
                finHistoire(7);
                break;
        }
    }
    
    public void scriptHistoireAmour(int nombre) {
        System.out.println("Vous raccompagnez "+ listeDamesDetresse.get(nombre).donneTonNom() +"jusqu'a sa chambre d'hotel.");
        listeDamesDetresse.get(nombre).seFaireLiberer(listeCowboys.get(0));
        listeDamesDetresse.get(nombre).changerRobe(listeCowboys.get(0), "violet");
        listeDamesDetresse.get(nombre).parler("Voulez vous être plus que mon héro ?");
        System.out.println(listeDamesDetresse.get(nombre).donneTonNom() +" est tombée amoureuse de vous.");
        finHistoire(5);
    }
            
    public void scriptMort(int nombre){
        switch(aleatoire(2)){
            case 0:
                System.out.println("Vous avez tiré mais les mouvements de votre cheval ont détérioré votre précision et vous touchez "+ listeDamesDetresse.get(nombre).donneTonNom() +".\n"
                        + "Le brigand s'enfuit et vous ne vous remetez pas de votre erreur de décision.");
                listeCowboys.get(0).parler("NON ! Je n'ai pas fais ça ?\n J'ai tué "+ listeDamesDetresse.get(nombre).donneTonNom() +", je ne peux pas revenir en ville.\n Je vais m'exiler dans le desert.");
                finHistoire(2);
                break;
            case 1:
                System.out.println("Vous tirez et touchez mortellement le brigand.\n"
                        + "Il s'écroule et vous vous avancez vers son cheval.");
                listeDamesDetresse.get(nombre).modifieTonEtat("sous le choc");
                listeCowboys.get(0).libererDame(listeDamesDetresse.get(nombre));
                listeDamesDetresse.get(nombre).parler("Merci de m'avoir libéré, je suis "+ listeDamesDetresse.get(nombre).donneTonEtat() +".");
                finHistoire(4);
        }
    }
    
    public void scriptFuite(){
        System.out.println( "Le brigand s'enfuit et vous ne vous remetez pas de votre erreur de décision.");
        listeCowboys.get(0).parler("NON ! Il a réussi à s'enfuir.");
        finHistoire(3);
    } 
    
    public void scriptDuel(int nombre){
        listeCowboys.get(0).parler("Dirigeons nous vers la sortie que l'on règle cette histoire au plus vite !");
        System.out.println("Vous vous dirigez tous les deux vers la sortie du "+listeBarmans.get(0).donneTonNomDeBar()+".");
        System.out.println("Le Sherif "+ listeSherifs.get(0).donneTonNom() +" dirige le duel.");
        listeSherifs.get(0).parler("Mettez vous dos à dos. Puis faites un pas à chaque fois que je compterai.\n "
                + "Quand j'arriverai à dix vous pourrez degainer et tirer sur votre adversaire.\n"
                + "Le gagnant sera celui qui restera en vie à la fin de ce duel.\n"
                + "Vous êtes prêt ?");
        listeBrigands.get(nombre).parler("OUI !");
        listeCowboys.get(0).parler("OUI !");
        listeBrigands.get(nombre).parler("Que le duel commence !");
        for(int i = 1; i<11; i++){
            listeSherifs.get(0).parler(i +" !");
        }
        System.out.println("Deux tirs retentissent.");
        switch(aleatoire(2)){
            case 0:
                System.out.println(listeBrigands.get(nombre).donneTonNom()+" s'écroule.\n"
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
        System.out.println("Vous vous dirigez vers la table de jeux.\n"
                + "A cette table se trouve trois joueurs.");
        listeRipoux.get(0).sePresenter();
        listeBrigands.get(1).sePresenter();
        listeRipoux.get(1).sePresenter();
        listeCowboys.get(0).parler("Bonjour !");
        listeCowboys.get(0).sePresenter();
        listeCowboys.get(0).parler("Est ce que je peux m'assoir à votre table ?");
        listeRipoux.get(0).parler("Biensur, mais je ne pense pas que vous ferez le poids !");
        System.out.println("Vous vous asseyez et la partie commence.");
        switch(aleatoire(2)){
            case 0:
                scriptVictoireCartes();
            case 1:
                scriptDefaiteCartes();
        }
    }
    
    public void scriptVictoireCartes(){
        System.out.println("Les tours de jeux s'enchainent, vous avez de la chance et finissez par gagner.");
        listeCowboys.get(0).parler("Haha, j'ai gagné ! Je vais pourvoir m'amuser ce soir !");
        listeBrigands.get(1).parler("Ce n'est pas possible d'avoir autant de chance, je suis certain que tu as tricher.\n"
                + "Voyons si tu as autant de chance lors d'un duel au pistolet.");
        scriptDuel(1);
    }
    
    public void scriptDefaiteCartes(){
        System.out.println("Les tours de jeux s'enchainent, vous n'avez pas de chance et finissez par perdre.");
        listeRipoux.get(0).parler("Haha, tu as vu que nu n'étais pas de taille !");
        switch(choixTroisPossibilites("Vous acceptez votre défaite et décidez de retourner au bar.","Vous êtes certain que votre chance va tourner et décidez de rejouer","Vous êtes certains d'être tombé sur des tricheurs et provoquez un duel")){
            case "a":
                scriptComptoir();
                break;
            case "b":
                scriptJeuxCartes();
                break;
            case "c":
                scriptDuel(1);
                break;
        }
    }
    
    public void finHistoire(int numeroFin){
        System.out.println("=============================================");
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
        System.out.println("=============================================");
        revivreHistoire();
    }
    
    public void revivreHistoire(){
        listeCowboys.clear();
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


