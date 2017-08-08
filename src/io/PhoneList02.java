package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		File file = new File("./phone.txt");
		BufferedReader br = null;
		Scanner scanner = null;
		try {
			//원래면 익셉션으로 file이 존재하는지 여부를 확인해야하는데 File에는 존재하는지 여부를 확인 할 수 있는 함수가 있다.
			if(file.exists() == false)
			{
				System.out.println("File Not Found");
				return;
			}
			
			System.out.println("=================================================");
			//파일의 절대경로 
			System.out.println("Path : " + file.getAbsolutePath());
			//파일의 크기
			System.out.println("Size : " + file.length() + "Bytes");
			
			//Long 형으로 나오니까 
			//Date date = new Date(file.lastModified());
			//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			System.out.println("Last Modified date : " + ( new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(new Date(file.lastModified())));
			
			
			System.out.println("======================전화번호======================");
			scanner = new Scanner(file);
			while(scanner.hasNextLine())
			{
				String name = scanner.next();
				String phone1= scanner.next();
				String phone2= scanner.next();
				String phone3= scanner.next();
				
				System.out.println(name + " : " + phone1 + "-" + phone2 + "-"+ phone3);
			}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
			if(scanner != null)
				scanner.close();
			}
		}
	}
