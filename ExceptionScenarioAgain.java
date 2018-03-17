package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionScenarioAgain {

	public static void main(String[] args) {
		try {
			openFile();
		} catch(FileNotFoundException e ) {
			System.out.println("FIle not found");
		}

		
	}
	//this type of method is to be used only when there is no instance created for the class
	//in that case it has to be static
	public static void openFile() throws FileNotFoundException {
		File file = new File("C:\\Users\\mnairchand\\Mohan\\Java\\introduction-to-programming-with-java\\BasicProgramming\\src\\demo3\\test1.txt");
		FileReader fr = new FileReader(file);		
	}
	
}
