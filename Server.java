/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketplace;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author ruth
 */
public class Server {
    
     public static final String MARKETNAME = "Marketplace";
    private MarketPlace marketObj;
            
    public Server() throws RemoteException 
    {
        //Tries to get rmiregistry, creates it if it doesn't exist
        try 
        {
            LocateRegistry.getRegistry(1080).list();
        }
        catch (RemoteException e) 
        {
            System.out.println("Creates rmiregistry");
            LocateRegistry.createRegistry(1080);
        }
        
        try 
        {
            marketObj = new MarketplaceImpl("marketplace");
            //Register object at rmiregistry
            Naming.rebind("rmi://localhost/" + MARKETNAME, marketObj);
            System.out.println(marketObj + " is ready");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    } 
    
    public static void main(String[] args) 
    {
        try 
        {
            new Server();
        } 
        catch (RemoteException ex) 
        {
            System.out.println("Problem starting server");
        }
    }    
}
