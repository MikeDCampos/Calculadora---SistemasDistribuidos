/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4_sd;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Michael
 */
public class CalculatorImpl extends UnicastRemoteObject implements Calculator{

    protected CalculatorImpl() throws RemoteException{
        super();
    }
    
    @Override
    public long addition(long a, long b) throws RemoteException {
        return a+b;
    }

    @Override
    public long subtraction(long a, long b) throws RemoteException {
        return a-b;
    }

    @Override
    public long multiplication(long a, long b) throws RemoteException {
         return a*b;
    }

    @Override
    public double division(double a, double b) throws RemoteException {
         return a/b;
    }
    
}
