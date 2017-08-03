package lang;

public class PointTest {

	public static void main(String[] args) {
		
		Point point = new Point();
		
		//heap에 Class 정보가 저장되어있다.
		point.getClass();
		
		System.out.println(point.getClass().getName());
		System.out.println(point.hashCode());
		System.out.println(point.toString());
		System.out.println(point);
		
		//String 객체와 비교
		
		String s = new String("hello");
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s.toString());
		System.out.println(s);
		

	}

}
