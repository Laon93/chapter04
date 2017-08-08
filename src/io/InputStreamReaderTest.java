package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		//fis 변수는 임시변수이니까 굳이 생성해주지 않고 reader에 직접적으로 넣어줘도 된다.
		//reader에 넣어주지 않는 경우에는 아래처럼 사용해야한다.
	/*	FileInputStream fis = null;
		Reader reader = null;
		try {
			fis = new FileInputStream("./ms949.txt");
			reader = new InputStreamReader(fis);
		
			}
			*/
		Reader  reader = null;
		try {
			//default로 UTF-8이 되어있으니까 다른 것으로 인코딩 되어있다면 알려줘야함. 
			//UTF-8인 경우에는 아래처럼 
			//reader = new InputStreamReader(new FileInputStream("./ms949.txt"));
			//아닌 경우에는 아래처럼!! 인코딩 형식이 맞지않으면 깨져서 나와요!! 
			reader = new InputStreamReader(new FileInputStream("./ms949.txt") , "MS949");
			
			//위의 코드에 인코딩 방식을 지정했는데 해당 인코딩이 되지 않거나 잘못되었을 수 있으니까 catch문에서
			//UnsupportedEncodingException을 추가해준다.
			
			int data = -1;
			while ((data = reader.read()) != -1) {
				System.out.print((char)data);
				
			}
			
		}catch(UnsupportedEncodingException e) {
			System.out.println("File Encoding Error!! " + e);
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception : " + e);
		} catch (IOException e) {
			System.out.println("I/O Error : " +e);
		}finally {
			try {
				if(reader != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("Reader close Error : " + e);
			}
		}
		
		

	}

}
