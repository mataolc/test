package test;

public class Test3 implements MyTest {
	private String name;
	private String password;
	
	Test3(String name){
		this.name = name;
	}
	
	Test3(String name,String password){
		this.name = name;
		this.password = password;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
