package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		Set<Value> set = new HashSet<Value>();
		
		Value v1 = new Value(5);
		Value v2 = new Value(9);
		Value v3 = new Value(32);
		Value v4 = new Value(77);
		Value v5 = new Value(35);
		
		set.add(v1);
		set.add(v2);
		set.add(v3);
		set.add(v4);
		set.add(v5);
		
		//순회
		Iterator<Value> it = set.iterator();
		while(it.hasNext()) {
			
		}

	}

}
