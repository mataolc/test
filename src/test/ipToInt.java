package test;

import java.util.StringTokenizer;

public class ipToInt {
	public static void main(String[] args) {
		
		String ip="192.168.1.10";
        String[] addrArray = ip.split("\\.");
        long num = 0;
        for (int i = 0; i < addrArray.length; i++)
        {
            int power = 3 - i;
            num += ((Integer.parseInt(addrArray[i]) % 256 * Math.pow(256, power)));
        }
        System.out.println(num);
        
        System.out.println(getIp(ip)); 
		
	}
	
	public static long getIp(String ipString){
		long result = 0;  
	      StringTokenizer token = new StringTokenizer(ipString,".");  
	      result += Long.parseLong(token.nextToken())<<24;  
	      result += Long.parseLong(token.nextToken())<<16;  
	      result += Long.parseLong(token.nextToken())<<8;  
	      result += Long.parseLong(token.nextToken());  
	      return result;  
	}
}
