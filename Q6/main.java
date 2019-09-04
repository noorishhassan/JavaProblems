/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_a1_q6;

/**
 *
 * @author Noorish Hassan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a1 = new PetAnimal();
        a1.sleep();
        a1.walk();
        a1.eatFood();
        a1.playWithIt();
        a1.playDead();
        a1.chaseBall();
        
        Animal a2 = new WildAnimal();
        a2.sleep();
        a2.walk();
        a2.eatFood();
    }
    
}
