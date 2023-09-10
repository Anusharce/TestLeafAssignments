package week3.day2;

public class StringReverse {

	public static void main(String[] args) {
		String name="TestLeaf";
		char[] ch=name.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}

	}

}
