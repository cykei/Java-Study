package com.j2.w14.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException; //네트워크가 끊어질때 

public interface GumballMachineRemote{
  public int getCount() throws RemoteException;
  public String getLocation() throws RemoteException;
  public State getState() throws RemoteException;
}
  