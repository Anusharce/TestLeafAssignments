package week4.day1Assignments;



import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		TreeSet<Integer> set = new TreeSet<Integer>();
    for (int i=0;i<data.length; i++)
    {
        set.add(data[i]);
    }
    List<Integer>list=new ArrayList<Integer>(set);
    System.out.println(list.get(4));
       

	}

	}
