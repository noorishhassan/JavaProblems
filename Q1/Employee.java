/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_a1_q1;
import java.util.ArrayList;
/**
 *
 * @author Noorish Hassan
 */
public class Employee {
    public int balance = 0;
    public int salary = 0;
    public ArrayList benefits;
    
    Employee()
    {
        balance = 0;
        salary = 0;
        benefits = new ArrayList();
        benefits.add("basic benefits");
    }
    
    Employee(int b, int s)
    {
        balance = b;
        salary = s;     
        benefits = new ArrayList();
        benefits.add("basic benefits");

    }
    
    public void calculatePay(){
        balance = balance + salary;
        System.out.println("Employee's balance calculated.");
    }
}
