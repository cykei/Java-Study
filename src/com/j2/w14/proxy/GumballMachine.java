package com.j2.w14.proxy;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine
		extends UnicastRemoteObject implements GumballMachineRemote 
{
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State outOfOrderState;
	
 
	State state = soldOutState;
	int count = 0;
 	String location;

	public GumballMachine(String location, int numberGumballs) throws RemoteException {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		outOfOrderState= new OutOfOrderState(this);
		
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
		this.location = location;
	}
 
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}
 
	public int getCount() {
		return count;
	}
 
    public State getState() {
        return state;
    }
 
    public String getLocation() {
        return location;
    }
  
    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    public State getOutOfOrderState() {
        return outOfOrderState;
    }

}

  
  public State getNoQuarterState() {
    return noQuarterState;
  }
  
  public State getHasQuarterState() {
    return hasQuarterState;
  }
  
  public State getSoldState() {
    return soldState;
  }
}