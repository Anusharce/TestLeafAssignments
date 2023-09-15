package week4.day1Assignments;

import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		String s="ANUSHA";
		char c[]=new char[s.length()];
		Set<Character> set=new TreeSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);

           set.add(c[i]);
        }
		System.out.println(set);

	}}
