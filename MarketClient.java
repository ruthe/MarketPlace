/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketplace;

import bank.Account;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This is the interface for a customer(client)
 * Methods are used when the server
 * needs to communicate with the actual customer.
 * notify customer that their item has been sold.
 * notify customer that a wish that was placed has come in to the marketplace.
 * get the bank account of the specific customer.
 * @author ruth
 */
public interface MarketClient extends Remote{
    
    void notifySold(Item item)throws RemoteException;
    
    void notifyWish(Item item)throws RemoteException;
    
    Account getBankAccount()throws RemoteException;
}
