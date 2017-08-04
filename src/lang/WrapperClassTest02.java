package lang;

public class WrapperClassTest02 {

	public static void main(String[] args) {

		System.out.println(Character.toLowerCase('A'));

		// isDigit --> String에서 제공해주지 않는다
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('@'));

		String s = "1234.23";
		int i;
		// .* --> string 모두
		// \\d+ --> 양수
		// -?\\d+ --> 음수
		// -?\\d+(\\.\\d+) 소수점도 됨

		/*
		 * if(s.matches("-?\\d+(\\.\\d+)") == false) 
		 * { 
		 * System.out.println("숫자가 아닙니다.");
		 * }else { 
		 * System.out.println("딩동댕"); 
		 * //이 아래의 코드를 실행하게 된다면 Exception이 발생하게 된다.
		 * //그렇기 때문에 try catch문을 사용해야하는데 별로 추천하지 않는 방법 
		 * //(try chath를 하게되면 메모리를 사용하기 때문에 비용이 추가된다.) 
		 * //Exception 왜 발생? ===> 숫자가 아닌걸 수행하게되면 Exception 발생하기 때문 
		 * i = Integer.parseInt(s); }
		 */

		System.out.println(Integer.parseInt("10", 10));
		System.out.println(Integer.parseInt("A", 16));
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toHexString(255));
		System.out.println(Double.parseDouble("44.13e-16"));
		System.out.println(Long.parseLong("123456789"));
		
		//typeOf를 쓰고싶었는뎁...
		System.out.println(String.valueOf(255) instanceof Object);
		

	}

}
