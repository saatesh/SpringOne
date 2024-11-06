package sisco.springsetter;

public class Manager {
	
	private TLead tl;
	
	public void setTl(TLead tl) {
		this.tl = tl;
	}

	public void doWork() {
		System.out.println("Manager work started.");
		tl.doWork();
		System.out.println("Manager work completed.");
	}

}
