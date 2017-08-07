package util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();

		list.add("둘리");
		list.add("마이콜");
		list.add("도우너");

		// 순회1
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}

		// remove
		list.remove(1);

		System.out.println("After remove");

		// 순회 2 - iterator 사용
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("==============================");
		// 순회3
		for (String s : list) {
			System.out.println(s);
		}

	}

}
