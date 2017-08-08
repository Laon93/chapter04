package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		File file = new File("./phone.txt");
		BufferedReader br = null;
		try {
			//원래면 익셉션으로 file이 존재하는지 여부를 확인해야하는데 File에는 존재하는지 여부를 확인 할 수 있는 함수가 있다.
			if(file.exists() == false)
			{
				System.out.println("File Not Found");
				return;
			}
			
			System.out.println("===========================================");
			//파일의 절대경로 
			System.out.println("Path : " + file.getAbsolutePath());
			//파일의 크기
			System.out.println("Size : " + file.length() + "Bytes");
			
			//Long 형으로 나오니까 
			//Date date = new Date(file.lastModified());
			//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			System.out.println("Last Modified date : " + ( new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(new Date(file.lastModified())));
			
			
			System.out.println("===================전화번호===================");
		
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
			
			String line =null;
			
			while((line = br.readLine()) != null)
			{
				StringTokenizer st = new StringTokenizer(line, " ");
				
				int index =0;
				
				while(st.hasMoreTokens()) {
					String s = st.nextToken();
					if(index == 0)
						System.out.print(s + " : ");
					else if(index == 1 || index == 2)
						System.out.print(s + "-");
					else 
						System.out.print(s);
					index++;
				}
				System.out.println("");
			}
		
		} catch (UnsupportedEncodingException e) {
			System.out.println("Unsupported Encoding Exception : " + e);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(br != null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
