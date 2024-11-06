package sisco.springconstructor;

public class Teamlead {
	private Developer dev;
	
	public Teamlead(Developer dev) {
		this.dev=dev;
	}
	
	public void doWork() {
		System.out.println("Teamlead work is started..");
		dev.doWork();
		System.out.println("Teamlead work is completd..");
	}
}
