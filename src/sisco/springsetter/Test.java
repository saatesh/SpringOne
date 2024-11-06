package sisco.springsetter;

public class Test {
	public static void main(String[] args) {
		Manager m=new Manager();		
		TLead tl=new TLead();
		Devloper dev=new Devloper();
		
		
		m.setTl(tl);		
		tl.setDev(dev);
		m.doWork();
	}

}
