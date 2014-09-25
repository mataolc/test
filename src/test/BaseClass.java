package test;

public class BaseClass {
	private static String name;
	private int age;
	protected String password;
	protected final String gender = "female";
	
	public void set(String name,int age){
		System.out.println("in baseClass");
		BaseClass.name = name;
		this.age = age;
	}
	
	public String toString(){
		System.out.println("Base:to String");
		return "name :" + BaseClass.name + "  age:" + this.age;
	}
}
