package week3.Day2Assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch=test.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			char c =ch[i];

			if (i % 2 != 0) { 
				c = Character.toUpperCase(c); 
			}
			System.out.print(c); 

		}}


}


