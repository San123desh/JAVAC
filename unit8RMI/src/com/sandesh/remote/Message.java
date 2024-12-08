package com.sandesh.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote{
	String sayName(String name) throws RemoteException;
	int findFactorial(int num) throws RemoteException;
	
}

