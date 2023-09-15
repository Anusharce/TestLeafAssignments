package week4.day1;


import java.util.Set;
import java.util.TreeSet;

public class google {

	public static void main(String[] args) {
		String name="google";
		char[] ch=name.toCharArray();
		Set<Character> ch1 =new TreeSet<>();
        for(char each:ch)
        {
        	
        ch1.add(each);
        }
        
        System.out.println(ch1);
	}

}
