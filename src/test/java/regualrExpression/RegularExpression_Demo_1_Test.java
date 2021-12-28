package regualrExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression_Demo_1_Test {
	/**
	 * Find method is Boolean return type
	 * It will check the next and go to next pattern
	 * 
	 * m.start() It will return the Index of the pattern inside the target String
	 * m.end() It will return the end index +1
	 * m.group() It will return me the regular expression or pattern
	 * 
	 * @param args
	 * 
	 */
	
	
	
	
	public static void main(String[] args)
	{
		/**
		 * If a static method returning the object of
	     * It's class then it is called as Static Factory Method
		 */
		//Pattern class will convert the Regular Expression into Java Object
		
		Pattern p = Pattern.compile("aba");
		
		//Matcher() taking the Target String as Arguments and converting it to Matcher class Object
		Matcher m = p.matcher("abaabaabaaba");
		
		while(m.find())
		{
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}

}
