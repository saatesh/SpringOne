package sisco.springconstructor;

public class Manager {
	
	private Teamlead tl;
	public Manager(Teamlead tl) {
		this.tl=tl;
	}
	public void doWork() {
		System.out.println("Manager work is started..");
		
		tl.doWork();
		System.out.println("Manager work is completed..");
	}

}
