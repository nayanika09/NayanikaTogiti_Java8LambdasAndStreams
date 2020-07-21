package epam.Java8StreamsAndLambdas;


public class StringPredicate {
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		if(str.equalsIgnoreCase(sb.reverse().toString())) {
			return true;
		}
		return false;
		  
	  }

	
}
