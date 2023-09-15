package week4.day1Assignments;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] s= {"google","wipro","atos"};
		Arrays.sort(s);
		 for(int i=s.length-1;i>=0;i--) 
		 {
		 System.out.println(s[i]); 
		 }
		 }

}
