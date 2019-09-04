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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Employee emp1 = new Intern(0, 10000);
        Employee emp2 = new SoftwareDeveloper();
                
        System.out.println(emp1.balance);

        emp1.calculatePay();
        System.out.println(emp1.balance);
        emp2.calculatePay();
        System.out.println(emp2.benefits);*/

        
        Employee [] emps = new Employee[10];
        emps[0] = new Intern(0, 10000);
        emps[1] = new SoftwareDeveloper(0, 40000);
        emps[2] = new ProjectManager(0, 70000);
        emps[3] = new Intern(0, 12000);
        emps[4] = new SoftwareDeveloper(0, 43000);
        emps[5] = new ProjectManager(0, 73000);
        emps[6] = new Intern(0, 9000);
        emps[7] = new SoftwareDeveloper(0, 37000);
        emps[8] = new ProjectManager(0, 68000);
        emps[9] = new Intern(0, 11000);
        
        for (int i = 0; i < emps.length; i++)
        {
            emps[i].calculatePay();
        }
    }
    
}
