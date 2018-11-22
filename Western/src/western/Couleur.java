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
public enum Couleur{
    ROUGE("rouge"),
    BLEUE("bleue"),
    NOIRE("noire");
    
    private String color = "";
    
    Couleur(String color){
        this.color = color;
    }
    
}
