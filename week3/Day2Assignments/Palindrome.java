package week3.Day2Assignments;

public class Palindrome {

	public static void main(String[] args) {
		String original="madam", rev="";
		 int strLength =original.length();

		    for (int i=(strLength-1); i >=0; --i) {
		      rev = rev+original.charAt(i);
		    }
            
		    if (original.equals(rev)) {
		      System.out.println(original + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(original  + " is not a Palindrome String.");
		    }
		  }
		
		

	}


