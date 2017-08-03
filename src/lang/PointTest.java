package lang;

public class PointTest {

	public static void main(String[] args) {
		
		Point point = new Point();
		
		//heap에 Class 정보가 저장되어있다.
		point.getClass();
		
		System.out.println(point.getClass().getName());
		//참조값 기반의 hashCode()
		System.out.println(point.hashCode());
		System.out.println(point.toString());
		System.out.println(point);
		
		//String 객체와 비교
		String s = new String("hello");
		System.out.println(s.getClass().getName());
		//내용 기반의 hashCode() 그렇기 때문에 다른 객체라도 hashCode는 같게 나올수 있다
		System.out.println(s.hashCode());
		System.out.println(s.toString());
		System.out.println(s);
		

	}

}
