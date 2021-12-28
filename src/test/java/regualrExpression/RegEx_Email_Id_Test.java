package regualrExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Email_Id_Test {
	
	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]{7,30}+@[a-z]{5,10}+.[a-z]{2,6}");
		Matcher m = p.matcher("example.sunnychinni111@yahoo.in");
		if(m.find() && m.group().equals("example.sunnychinni111@yahoo.in"))
		{
			System.out.println("Email Id is Matching");
		}
		else
		{
			System.out.println("Email is not Matching");
		}
	}

}
