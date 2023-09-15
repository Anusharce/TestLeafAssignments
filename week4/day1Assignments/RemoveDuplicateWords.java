package week4.day1Assignments;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Input: "+text);
	     String[] words =text.split(" ");
	     Set<String> set=new LinkedHashSet<>();
	     for(int i=0;i<words.length;i++)
	     {
	    	 set.add(words[i]);
	     }
	    
	   
	     System.out.println(set);
	     

	}

}
