package ch17;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx01 {
	
	public static void main(String[] args) {
		File file = new File("ch17/abc.txt"); 
		try {
			file.createNewFile();
			FileWriter writer = new FileWriter(file); 
			writer.write("Java Programming"); 
			writer.flush(); 
			writer.close(); 
			System.out.println("���� �ۼ� �Ϸ�");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}