/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketplace;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ruth
 */
class MarketplaceImpl extends UnicastRemoteObject implements MarketPlace {
    
    List<Item> items;
    List<MarketClient> clients;
   

    MarketplaceImpl(String marketplace) throws RemoteException {
        items = new ArrayList();
        clients = new ArrayList<MarketClient>();
          }

    @Override
    public void register(MarketClient client) throws RemoteException {
       
        if (!clients.contains(client))
			clients.add(client);
    }

    @Override
    public void unregister(MarketClient client) throws RemoteException {
        if (clients.contains(client))
			clients.remove(client);}

    @Override
    public void sell(Item item, MarketClient client) throws RemoteException {
        
        item.add(item);
    }

    @Override
    public void buy(Item item, MarketClient client) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void wishToBuy(Item item, MarketClient client) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Item> inspectItems() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
