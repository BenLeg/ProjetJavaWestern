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
public class Western {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Humain homme = new Humain("Bob","la biere");
        homme.sePresenter();
        homme.parle("Pour devenir un héros, il faut savoir mourir au bon moment.");
    }
    
}
