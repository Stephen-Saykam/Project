package regualrExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Email_Id_Test {
	
	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9\\W]*[.com/.in]");
		Matcher m = p.matcher("sunnychinni111@gmail.in");
		if(m.find() && m.group().equals("sunnychinni111@gmail.in"))
		{
			System.out.println("Email Id is Matching");
		}
		else
		{
			System.out.println("Email is not Matching");
		}
	}

}
