package week3.Day2Assignments;

public class ReverseEvenPosition {

	public static void main(String[] args) {
		String s="I am a software tester",rev="";
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(i%2==1)
			{
				char c[] =words[i].toCharArray();
				for(int j=c.length-1;j>=0;j--)
				{
					rev+=c[j];
				}
			}
			else
			{
				rev+=words[i];
			}
			rev+=" ";
		}
		System.out.println(rev);
	}

}
