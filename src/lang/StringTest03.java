package lang;

public class StringTest03 {
	
	public static void main(String[] args) {
		
		String str1 = "aBcAbCabcABC";
		
		//3번째 문자열을 출력한다.
		System.out.println(str1.charAt(2));
		
		//"abc"문자열이 처음으로 나타나는 인덱스를 추적한다.
		System.out.println(str1.indexOf("abc"));
	
		//"abc'문자열이 마지막으로 나타나는 인덱스를 추적한다.
		System.out.println(str1.lastIndexOf("abc"));
		
		//위 문자열의 문자 개수를 출력한다.
		System.out.println(str1.length());
		
		//'a'를 'R'로 대체한 결과를 출력한다.
		System.out.println(str1.replaceAll("a", "R"));
		
		//"abc" 문자열을 "123"문자열로 대체한 결과를 출력한다.
		System.out.println(str1.replaceAll("abc", "123"));
		
		//처음 3개의 문자열만을 출력한다.
		System.out.println(str1.substring(0, 3));
		
		//문자열을 모두 대문자로 변경하여 출력한다.
		System.out.println(str1.toUpperCase());
		
	}

}
