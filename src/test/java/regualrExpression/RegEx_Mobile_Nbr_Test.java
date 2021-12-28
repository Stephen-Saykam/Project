package regualrExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Mobile_Nbr_Test {
	
	public static void main(String[] args) {
		
		/**
		 * For Normal 10 Digits Mobile Number
		 * [6-9][0-9]{9}
		 */
		
		/**
		 * [6-9]  First nbr of Mobile nbr starts in India
		 * [0-9]  Remaining 9 digits of mobile nbrs
		 * {9}    That 9 digits should be in 0-9 nbrs only
		 * 
		 */
//		Pattern p = Pattern.compile("[6-9][0-9]{9}");
//		Matcher m = p.matcher("8949521032");
//		if(m.find() && m.group().equals("8949521032"))
//		{
//			System.out.println("10 Digit Mobile Nbr is Maching");
//		}
//		else
//		{
//			System.out.println("10 Digit Moble nbr is not Matching");
//		}
		
		/**
		 * For Roaming 11 Digits Mobile Number
		 * [0][6-9][0-9]{9}
		 * 		or
		 * 0?[6-9][0-9]{9}
		 */
		
//		Pattern p = Pattern.compile("0?[6-9][0-9]{9}");
		
//		Pattern p = Pattern.compile("[0][6-9][0-9]{9}");
//		Matcher m = p.matcher("08949521032");
//		if(m.find() && m.group().equals("08949521032"))
//		{
//			System.out.println("Starting 0 digit Mobile Nbr is Maching");
//		}
//		else
//		{
//			System.out.println("Starting 0 digit Moble nbr is not Matching");
//		}
		
		
		/**
		 *  For 12 Digits Mobile Number
		 *  91?[6-9][0-9]{9}
		 */
		
		Pattern p = Pattern.compile("91?[6-9][0-9]{9}");
		Matcher m = p.matcher("918949521032");
		if(m.find() && m.group().equals("918949521032"))
		{
			System.out.println("12 Digit Mobile Nbr is Maching");
		}
		else
		{
			System.out.println("12 Digit Moble nbr is not Matching");
		}

	}

}
