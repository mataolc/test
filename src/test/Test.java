package test;

import java.io.File;
import java.io.IOException;



public class Test {
	
	
	public static void main(String[] args) throws IOException{
		String str = "8^A5";
		System.out.println(str.substring(str.indexOf("_") + 1));
	}
}
