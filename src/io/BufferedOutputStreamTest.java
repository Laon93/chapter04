package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {
			// FileOutputStream fos = new FileOutputStream("./123.txt");
			bos = new BufferedOutputStream(new FileOutputStream("./123.txt"), 5);
			//buffer가 가득차지 않으면, flush되지 않는다.
			//그러다가 close될때 flush가 된다.
			//원하는 위치에서 flush를 하고 싶으면 함수를 호출해주면된다.
			//하지만 너무 자주 해준다면 buffer을 쓴 이유가 사라지게 되니 유의!!
			//bos.flush();
			for(int i = '1'; i <= '9'; i++)
			{
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception : " + e);
		} catch (IOException e) {
			System.out.println("I/O Exception : " + e);
		} finally {

			try {
				if (bos != null)
					bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
