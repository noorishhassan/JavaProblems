/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_a1_q2;

/**
 *
 * @author Noorish Hassan
 */
public class main 
{     
    public static class Student
    {         
        void openRegistrationPage()
        {
            try{
                long coursesOfferred[] = new long[1000000000];    
                System.out.println("Registration period active.");

            }
            catch(OutOfMemoryError e)
            {
                System.out.println("Registration period active.");
                System.out.println("");
                System.out.println("Error: Too many courses.");

            }
        }     
    }     
    public static void main(String[] args) 
    {         
        Student currentStudent= new Student();         
        currentStudent.openRegistrationPage();

    } 
} 
