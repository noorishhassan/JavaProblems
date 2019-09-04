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
public class PetAnimal extends Animal implements Tricks{
    
    public void eatFood()
    {
        System.out.println("pet animal is fed");
    }
    
    
    public void playWithIt()
    {
        System.out.println("you are playing with your pet animal");
    }
    public void playDead()
    {
        System.out.println("your pet is playing dead");

    }
    
    public void chaseBall()
    {
        System.out.println("your pet is chasing a ball");

    }
    
}
