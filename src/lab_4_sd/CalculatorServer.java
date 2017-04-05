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
public class CalculatorServer {
    CalculatorServer(){
        try{
            Calculator c =new CalculatorImpl();
            Naming.rebind("rmi://localhost:1099/CalculatorService", c);
        }catch(Exception e){
            System.out.println("Exception is: "+e);
        }
    }
    
    public static void main(String args[]){
        new CalculatorServer();
    }
}
