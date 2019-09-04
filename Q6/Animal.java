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
abstract class Animal implements Tricks{
    public void walk()
    {
        System.out.println("Animal is walking");
    }
    public void sleep()
    {
        System.out.println("Animal is sleeping");
    }
    public abstract void eatFood();
        
    public abstract void playDead();
    //{
      //  System.out.println("your pet is playing dead");

    //}
    
    public abstract void chaseBall();
    //{
      //  System.out.println("your pet is chasing a ball");

    //}
    public abstract void playWithIt();
    //{
      //  System.out.println("you are playing with your pet animal");
    //}
}
