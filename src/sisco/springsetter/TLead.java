package sisco.springsetter;

public class TLead {
	private Devloper dev;
	
	public void setDev(Devloper dev) {
		this.dev = dev;
	}

	public void doWork() {
		System.out.println("Teamlead work started.");
		dev.doWork();
		
		System.out.println("Teamlead work ended.");
	}

}
