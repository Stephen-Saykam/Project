package regualrExpression;

import java.util.regex.Pattern;

public class RegExp_Pattern_Split_Test {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a");
		String[] s = p.split("TestYantra Software Solution");
		for(String s1:s)
		{
			System.out.println(s1);
		}

	}

}
