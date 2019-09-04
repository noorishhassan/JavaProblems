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
public class SoftwareDeveloper extends Employee{
    public String type = "Software Developer";

    SoftwareDeveloper()
    {
        benefits.add("health insurance");
        benefits.add("dev benefits");

    }
    
    SoftwareDeveloper(int b, int s)
    {
        super(b,s);
        benefits.add("health insurance");
        benefits.add("dev benefits");

    }
    
    public void calculatePay()
    {
        balance = balance + salary;
        System.out.println("Software Developer's balance calculated.");
    }
}
