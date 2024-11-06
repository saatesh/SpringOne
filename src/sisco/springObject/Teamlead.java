package sisco.springObject;

public class Teamlead {
	Devloper dov=new Devloper();
	
	public void doWork() {
		System.out.println("Teamlead work is started.");
		dov.doWork();
		System.out.println("Teamlead work is completed.");
	}

}
