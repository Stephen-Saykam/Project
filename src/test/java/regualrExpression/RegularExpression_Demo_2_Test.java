package regualrExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression_Demo_2_Test {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[a-zA-Z0-9]");
		Matcher m = p.matcher("abCD96ab");
		while(m.find())
		{
			System.out.println(m.start()+" "+m.group());
		}

	}

}
