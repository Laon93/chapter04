package lang;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		Character c = new Character('c');
		
		Float f = new Float(3.14);
		boolean b = new Boolean(true);
		
		//Auto Boxing
		Integer j = 10;
		
		//원래 아래의 것이 정석!! 
		//int k = 20 + j.intValue();
		//하지만 편하게 쓰라고 아래 것도 지원해준다.
		int k = 20 + j;

	}

}
