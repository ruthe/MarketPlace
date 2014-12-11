/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketplace;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ruth
 */
public class ItemImpl extends UnicastRemoteObject implements Item{
    
    private String name;
    private float price;
    
    public ItemImpl (String name, float price) throws RemoteException {
		this.name = name;
		this.price = price;
	}

        @Override
        public String getName() throws RemoteException {
            return name;
        }

        @Override
        public void setName(String name) throws RemoteException {
            this.name = name;
        }

        @Override
        public float getPrice() throws RemoteException {
            return price;
        }

        @Override
        public void setPrice(float price) throws RemoteException {
            this.price = price;
        }

}
