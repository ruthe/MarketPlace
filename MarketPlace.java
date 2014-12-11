/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketplace;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * This is the interface for a marketplace
 * At the marketplace customers can 
 * register and unregister. 
 * Sell and buy items 
 * put in a wish for an item to buy 
 * get all the available items that exists in the marketplace.
 * @author ruth
 */
public interface MarketPlace extends Remote{
    
    void register(MarketClient client) throws RemoteException;
    
    void unregister(MarketClient client) throws RemoteException;
    
    void sell(Item item, MarketClient client)throws RemoteException;
    
    void buy(Item item, MarketClient client)throws RemoteException;
    
    void wishToBuy(Item item, MarketClient client)throws RemoteException;
    
    ArrayList <Item> getAvaileble()throws RemoteException; 
}
