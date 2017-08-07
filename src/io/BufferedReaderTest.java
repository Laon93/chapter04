package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {
			// 자기 자신을 호출
			br = new BufferedReader(new FileReader("./src/io/BufferedReaderTest.java"));

			int index = 0;
			String line = null;
			while ((line = br.readLine()) != null) {
				index ++;
				System.out.println(index + " : " + line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception : " + e);
		} catch (IOException e) {
			System.out.println("I/O Exception : " + e);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
