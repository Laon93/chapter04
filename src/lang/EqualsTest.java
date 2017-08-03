package lang;

public class EqualsTest {

	public static void main(String[] args) {
		Point point1 = new Point(10, 20);
		Point point2 = new Point(10, 20);

		Point point3 = point2;

		// 같은 객체를 가르키고 있는가
		System.out.println(point1 == point2);
		System.out.println(point2 == point3);

		// 두 객체의 동질성 비교
		// equals가 오버라이드가 안된 경우에는 == 로 비교한것과 동일하다
		// override 하기전 결과     false / true
		// override 하고난 후 결과 true / true
		System.out.println(point1.equals(point2));
		System.out.println(point2.equals(point3));

		System.out.println("===================");

		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = s2;

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);

		System.out.println(s1.equals(s1));
		System.out.println(s2.equals(s3));

		// hashcode() 비교
		System.out.println("hashCode() 비교");
		System.out.println("s1.hashCode() : " + s1.hashCode());
		System.out.println("s2.hashCode() : " + s2.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
		//String Literal
		String str1 = "hello";
		String str2 = "hello";
		String str3 = str2;
		
		//String을 생성하면 자동적으로 String str1 = new String()으로 저장된다더니!!
		//왜 str1 == str2 가 true가 되지?!?
		//==> 문자열 상수 Pool이라는 것이 존재하고 이 문자열 상수 Pool은 내가 "hello"라는 것을 저장하고 있게되는데
		//여기에 hashcode와 reference를 확인하여 이와 동일한 문자가 존재하는지 확인을 한 후 존재하지 않으면 새로 생성하게되고,
		//같은 문자가 있는 것으로 확인되었을 경우 기존에 만들어두었던 참조값을 반환해준다. 그렇기 때문에 str1 == str2가 된다.
		//그렇기 때문에 String은 내부의 값을 변경할 수 없다 --> str2, str3도 hello를 가르키고 있는데 str1에서 내부의 값을 변경해버리면
		//str2, str3가 가르키고 있는 값까지 변하기 때문
		//Integer 역시 이와 같은 형식으로 만들어져있다. 그렇기 때문에 String과 Integer을 사용하는 것이 성능상 더 좋다.
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		
	}

}
