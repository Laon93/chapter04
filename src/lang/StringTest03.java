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
		
		//공백제거
		String str2 = "aa bb cc dd ee ff";
		System.out.println(str2.trim());
		
		//문자열 분리
		String str3[] = str2.split(" "); 
		for(int i=0; i<str3.length; i++)
			System.out.println(str3[i]);
		
		System.out.println("".length());
		String str5 = "";
		System.out.println(str5.length());
		
		//배열이라서 length가 1 찍힌듯
		String str4[] = {""};
		System.out.println(str4.length);
		
		
	}

}
