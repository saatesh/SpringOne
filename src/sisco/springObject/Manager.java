package sisco.springObject;

public class Manager {
	
	Teamlead tl =new Teamlead();
	
	public void doWork() {
		System.out.println("Manager work is started..");
		tl.doWork();
		System.out.println("Manager work is completed..");
	}
}
