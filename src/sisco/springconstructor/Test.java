package sisco.springconstructor;

public class Test {
	public static void main(String[] args) {
		
		Developer dev=new Developer();
		
		Teamlead tl=new Teamlead(dev);
		
		//Manager man=new Manager(tl);
		tl.doWork();
	}

}
