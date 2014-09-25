package test;

import java.util.HashMap;
import java.util.Map;

//好好看看
public class PrintName {
	

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		String[] array = new String[]{"abc","def","ghi","jkl","mno"};
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < 1000000; i ++){
			sb.setLength(0);
			sb.append(array[0]).append(array[1]).append(array[2]).append(array[3]).append(array[4]);
		
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println("sb.length = " + sb.length() + "	" + sb.capacity());
		
/////////		////////////////////////////////////////////////////
		String str = new String();
		long start2 = System.currentTimeMillis();
		for(int i = 0; i < 1000000;i++){
			String s = array[0] + array[1] + array[2] + array[3] + array[4];
		}
		long end2 = System.currentTimeMillis();
		
		System.out.println(end2 - start2);
	}
}
