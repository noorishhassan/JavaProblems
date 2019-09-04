/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_a1_q5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Noorish Hassan
 */
public class A implements I{
    public void exitGame()
    {
        System.out.println("exiting game");
    }
    public void continuePlaying()
    {
        System.out.println("continue playing");
    }
    public boolean stopWastingTime()
    {
        System.out.println("Enter 1 to continue playing, 2 to exit.");

        Scanner input = new Scanner(System.in);
        int var = input.nextInt();
        
        if (var == 1)
            return false;
        else
            return true;

    }
    
}
