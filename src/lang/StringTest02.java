package lang;

public class StringTest02 {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "cde";
		String str3 = str2;

		System.out.println(str1);
		System.out.println("upper전 : " + str2);
		str2 = str3.toUpperCase();
		System.out.println("upper후 : " + str2);
		System.out.println(str3);

		String str4 = str2.concat("??");
		System.out.println(str2);
		System.out.println(str4);

		//스트링을 비교하고자 할때,  
		//if("hello".equals(s) )가 if(s.equals("hello"))보다 더 좋다
		//why? s는 위에서 프로그램이 실행되면서 변했을 가능성이 있다.
		//그렇기 때문에 만약 s가 null이 되어버렸다면 s.equals("hello") 에서는 exception 발생
		
		//Method Chain
		String s = "!".concat(str2).concat("@");
		System.out.println(s);

	}

}
