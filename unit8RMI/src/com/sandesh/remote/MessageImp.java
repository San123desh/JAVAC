package com.sandesh.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImp extends UnicastRemoteObject implements Message{

	public MessageImp() throws RemoteException {
		super();//calls the constructor of unicastremoteobj
		
	}

	public static void main(String[] args) {
		

	}

	@Override
	public String sayName(String name) throws RemoteException {
		
		return "My name is " + name + ".It has " + name.length() + "no. of characters.";
	}

	@Override
	public int findFactorial(int num) throws RemoteException {
		if(num == 0|| num ==1)
			return 1;
		else
			return num*findFactorial(num - 1);
	}

}
