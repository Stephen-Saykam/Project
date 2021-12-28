package regualrExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpress_Password_Test {

	/**
	 *\\s---> Contains Space Characters
	 *\\S---> Except spaces
	 *\\d---> All the digits
	 *\\D---> Except digits
	 *\\w---> Alphanumeric
	 *\\W---> Special Characters
	 *. --->  Any Characters
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\W");
		Matcher m = p.matcher("abCD96#$Ab");
		while(m.find())
		{
			System.out.println(m.start()+" "+m.group());
		}

	}

}
