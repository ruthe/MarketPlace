/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketplace;

import bank.Account;
import bank.Bank;
import bank.RejectedException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ruth
 */
public class MarketClientImpl extends UnicastRemoteObject implements MarketClient {
    private String bankname ="Nordea";
    private Bank bankobj;
    private String marketname="Marketplace";
    private MarketPlace marketobj;
    
    
    /**
     *
     */
    public MarketClientImpl() throws RemoteException{
        
        try {
            try {
                LocateRegistry.getRegistry(1099).list();
            } catch (RemoteException e) {
                LocateRegistry.createRegistry(1099);
            }
            bankobj = (Bank) Naming.lookup(bankname);
            marketobj = (MarketPlace) Naming.lookup(marketname);
        } catch (Exception e) {
            System.out.println("The runtime failed: " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Connected to bank: " + bankname);
        
        System.out.println("Connected to marketplace: " + marketname);
    }
    

    @Override
    public void notifySold(Item item) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyWish(Item item) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Account getBankAccount() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main (String args[]) throws RemoteException{
        new MarketClientImpl();
    }
}
