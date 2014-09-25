package test;

public class ChildClass extends BaseClass {
	public void printChild(){
		System.out.println("in chlid class");
		
	}
	
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.set("taoge", 22);
		System.out.println(cc.gender);
	}
}
