package com.sandesh.servermain;

import com.sandesh.remote.MessageImp;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMain {
	private void startServer() throws RemoteException, AlreadyBoundException{
			Registry registry = LocateRegistry.createRegistry(1099);
// create a new service named myMessage with remote object
			registry.bind("myMessage", new MessageImp());
			System.out.println("Server is running...");
	}

	public static void main(String[] args) throws AlreadyBoundException, RemoteException, NotBoundException {
		ServerMain main = new ServerMain();
		main.startServer();
	}

}