package demo3;

import java.io.IOException;
import java.text.ParseException;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		try {
			test.run();
		}catch(ParseException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
