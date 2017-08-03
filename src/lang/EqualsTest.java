package lang;

public class EqualsTest {

	public static void main(String[] args) {
		Point point1 = new Point(10, 20);
		Point point2 = new Point(10, 20);

		Point point3 = point2;

		//같은 객체를 가르키고 있는가
		System.out.println(point1 == point2);
		System.out.println(point2 == point3);
		
		//두 객체의 동질성 비교
		//equals가 오버라이드가 안된 경우에는 ==로 비교한것과 동일하다
		System.out.println(point1.equals(point2));
		System.out.println(point2.equals(point3));
		
		System.out.println("===================");
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = s2;
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		System.out.println(s1.equals(s1));
		System.out.println(s2.equals(s3));

	}

}
