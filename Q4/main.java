/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_a1_q4;

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
        
        Student s1 = new FullFee();
        Student s2 = new Scholarship();
        
        s1.calculation(1, 10000);
        s2.calculation(1, 10000);

    }
    
}
