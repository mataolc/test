package test;

import java.util.ArrayList;
import java.util.List;

public class DoubleFormatStr {
	
	static String str = "abdsfsfsd";
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		String[] array = new String[]{"abc","def","ghi","jklsdf"};
		
//		long sTime = System.currentTimeMillis();
//		for(int i = 1; i < 1000000 ;i ++){
//			sb.setLength(0);
//			sb.append(str).append(str).append(str);
////			.append(array[0]).append(array[1]).append(array[2]).append(array[3]);
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println(endTime - sTime);
		
		List<String> strList = new ArrayList<String>();
		
		String s = new String();
		long sTime2 = System.currentTimeMillis();
		for(int i = 1; i < 1000000 ;i ++){
			s = str + str + str;
//					+ array[0] + array[1] + array[2] + array[3];
		}
		long endTime2 = System.currentTimeMillis();
	
		System.out.println(endTime2 - sTime2);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.pow(2, 31));
//		System.out.println(sb.capacity());
		
	}
}
