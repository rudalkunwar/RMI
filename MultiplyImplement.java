package myrmi;
import java.rmi.*;
import java.rmi.server.*;
public class MultiplyImplement extends UnicastRemoteObject implements Multiply {
    
    Multiply() throws RemoteException{
        super();
    } 
    public int doMultiply(int x , int y) throws RemoteException{
        return x * y ;
    }
}