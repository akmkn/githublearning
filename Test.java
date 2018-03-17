package demo3;

import java.io.IOException;
import java.text.ParseException;

public class Test {
	public void run () throws IOException, ParseException {
		int code = 3;
		if(code==2) {
			throw new ParseException("Error in command list",2);		
		}
		else if (code==3)
		{
			throw new IOException ("Number is 3");
		}		
	}
}
