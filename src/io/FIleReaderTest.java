package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;


//소스에 직접적으로 적으면 주스트림
//그러니까 얘들은 주 스트림! --> 소스에서 직접 적으니까
//그게 아닌 애들은 보조 스트림!!  
//보조 스트림은 주 스트림에서 받아오는 데이터들을 가공하는 역할을 한다.
public class FIleReaderTest {

	public static void main(String[] args) {
		InputStream is = null;
		Reader reader = null;
		try {
			reader = new FileReader("./hello.txt");
			int count = 0;
			int data = -1;
			while((data = reader.read())!= -1) {
				count++;
				System.out.print((char)data);
			}
			System.out.println("\n읽은 횟수 : " + count);
			System.out.println("====================");
			while((data = reader.read())!= -1) {
				count++;
			}
			
				
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found Exception : " + e);
		} catch (IOException e) {
			System.out.println("I/O Exception : "+ e );
		}finally {
			try {
				if(reader != null)
				reader.close();
			} catch (IOException e) {
				System.out.println("Reader Close Exception : " +e);
			}
		}
		

	}

}
