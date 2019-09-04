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
public class ProjectManager extends Employee{
    public String type = "Project Manager";

    ProjectManager()
    {
        benefits.add("health insurance");
        benefits.add("dev benefits");
        benefits.add("manager benefits");
    }
    
    ProjectManager(int b, int s)
    {
        super(b, s);
        benefits.add("health insurance");
        benefits.add("dev benefits");
        benefits.add("manager benefits");
    }
    
    public void calculatePay()
    {
        balance = balance + salary;
        System.out.println("Project Manager's balance calculated.");
    }
}
