/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4_sd;

import java.rmi.Naming;

/**
 *
 * @author Michael
 */
public class CalculatorClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Calculator c = (Calculator)Naming.lookup("//127.0.0.1:1099/CalculatorService");
            System.out.println("Addition (5,4) >> "+c.addition(5,4));
            System.out.println("Subtraction (5,4) >> "+c.subtraction(5,4));
            System.out.println("Multiplication (5,4) >> "+c.multiplication(5,4));
            System.out.println("Division (5,4) >> "+c.division(5,4));
        }catch(Exception e){
            System.out.println("Exception is: "+e);
        }
    }
    
}
