/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_a1_q1;

/**
 *
 * @author Noorish Hassan
 */
public class Intern extends Employee{
    public String type = "Intern";

    Intern()
    {
        
    }
    
    Intern(int b, int s)
    {
        super(b,s);
    }
    
    public void calculatePay()
    {
        balance = balance + salary;
        System.out.println("Intern's balance calculated.");
    }
}
