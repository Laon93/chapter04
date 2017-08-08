package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		/*InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in, "UTF-8");
			br = new BufferedReader(isr);
		}*/ 
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			while(true)
			{
				System.out.print(">>");
				String line = br.readLine();
				if(line == null)
					break;
				if("exit".equals(line))
					break;
				
				System.out.println(line);
			}
		}
		catch (UnsupportedEncodingException e) {
			System.out.println("Unsupported Encoding : " + e);
		} catch (IOException e) {
			System.out.println("I/O Error : " + e);
		}finally {
			try {
				if(br!=null)
					br.close();
			} catch (IOException e) {
				System.out.println("br.close() I/O Error : " + e );
			}
		}

	}

}
