/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package western;

/**
 *
 * @author legbe
 */
public class Sherif extends CowBoy{
    protected int nbBrigandCoffre;
    
    public Sherif(){
        super();
        nbBrigandCoffre = 27;
    }

    public Sherif(String nom, String adjectif, String boissonFavorite, int popularite) {
        super(nom, boissonFavorite, popularite, adjectif);
    }

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
    
    public void coffrer(Brigand nomBrigand){
        System.out.println("J'ai fini pas mettre "+ nomBrigand +" sous les verrous !");
        nbBrigandCoffre = nbBrigandCoffre + 1;
    }


}
