package week3.Day2Assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Input: "+text);
	     String[] words =text.split(" ");
	     String output="";
	     for(int i=0;i<words.length;i++)
	     {
	    	 if(!words[i].equals(""))
	    	 {
	    		 output+=words[i]+" ";
	    	     for(int j=i+1;j<words.length;j++)
	    	     {
	    	    	 if(words[i].equals(words[j]))
	    	    	 {
	    	    		 words[j]="";
	    	    	 }
	    	     }
	    	 }
	     }
	     System.out.println("Output: "+output);
	        }}

