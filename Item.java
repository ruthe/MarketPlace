/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketplace;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *This is the interface for an item you can
 * get the name of the item.
 * set a name for an item.
 * get the price for the item.
 * set a price for an item.
 * two getters and two setters.
 * @author ruth
 */
public interface Item extends Remote{

   String getName()throws RemoteException;
   
   void setName(String name)throws RemoteException;

   float getPrice()throws RemoteException;
       
   void setPrice(float price)throws RemoteException;
    
}
