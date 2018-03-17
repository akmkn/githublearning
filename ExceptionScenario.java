package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionScenario {

	public static void main(String[] args) {
		File file = new File("test1.txt");
		try {
			FileReader fr = new FileReader(file);
			
		} catch(FileNotFoundException e) {
			System.out.println("File Not Found"+file.toString());
		}
		

	}

}
