package week4.day1Assignments;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {

	public static void main(String[] args) {
		String s="PayPal India";
		char[] c = s.toCharArray();
		Set<Character>charset=new LinkedHashSet<>();
		Set<Character>dupcharset=new LinkedHashSet<>();

		for(char a:c)
		{
			if(!charset.add(a))
			{
				dupcharset.add(a);
			}



		}
		charset.removeAll(dupcharset);
		for(char output:charset)
		{
			if(output!=' ')
			{
				System.out.print(output);
			}
		}

	}}
