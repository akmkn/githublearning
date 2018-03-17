package demo2;

import java.io.IOException;

public class ExceptionThrowThrows {

	public static void main(String[] args) {
		CustomClass cc = new CustomClass();
		try {
			cc.run();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
