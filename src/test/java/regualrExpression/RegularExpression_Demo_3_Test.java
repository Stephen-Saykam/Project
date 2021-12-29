package regualrExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression_Demo_3_Test {

	public static void main(String[] args) {
		
//		Pattern p = Pattern.compile("a");
//		Pattern p = Pattern.compile("a+");
//		Pattern p = Pattern.compile("a*");
		Pattern p = Pattern.compile("a?");
		Matcher m = p.matcher("abbaabaab");
		while(m.find())
		{
			System.out.println(m.start()+" "+m.group());
		}

	}

}
