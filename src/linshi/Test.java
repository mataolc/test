package linshi;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<Integer	,Integer> map = new HashMap<Integer,Integer>();
		map.put(1,1);
		map.put(1, 2);
		System.out.println(map.size());
		System.out.println(map.get(1));
	}
}
