package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//auto-boxing이 일어나는 것.
		//new integer ~~ 이런거 안해줘도 okay
		map.put("둘리", 100);
		map.put("도우너", 50);
		map.put("마이콜", 80);
		map.put("길동", 90);
		
		//중복
		map.put("둘리", 50);

		
		//hash code 와 equals가 구현되어 있어야한다.
		//auto unboxing
		int score = map.get("둘리");
		System.out.println(score);
		map.remove("둘리");
		//평균
		Set<String> keySet = map.keySet();
		int avg=0;
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			int result = map.get(key);
			avg += result;
			//System.out.println(result);
		}
		
		System.out.println("평균 : " + (avg/keySet.size()));
		
		
	}

}
