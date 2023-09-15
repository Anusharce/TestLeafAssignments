package week4.day1Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] data = {1,2,3,5,6,7,8,9,10};
		TreeSet<Integer> set = new TreeSet<Integer>();
    for (int i=0;i<data.length; i++)
    {
    	if(i+1!=data[i])
    	{
        set.add(i+1);
        break;
    }}
    List<Integer>list=new ArrayList<Integer>(set);
    System.out.println(list);

	}

}
