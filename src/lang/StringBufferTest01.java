package lang;

public class StringBufferTest01 {

	public static void main(String[] args) {
		
		//생성
		StringBuffer sb = new StringBuffer( "This" );
		
		System.out.println(sb.length() + " : " + sb.capacity());
		
		//문자열 덧붙이기
		sb.append( " is pencil");
		System.out.println(sb);
		
		sb.insert(7, " my");
		System.out.println(sb);
		
		sb.replace(8,10, "your");
		System.out.println(sb);
		
		sb.setLength(3);
		System.out.println(sb);
		
		//문자열 + 연산은 내부적으로 StringBuffer 객체로 변환
		String s1 = "Hello" + " World" + 10 + true;
		System.out.println(s1);
	}

}
