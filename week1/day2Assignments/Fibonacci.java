package week1.day2Assignments;

public class Fibonacci {

	public static void main(String[] args) {
		int firstNum=0, secondNum=1, sum=0;
		System.out.println(firstNum+ "\n" +secondNum);
		for(int i=1;i<=11;i++)
		{
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			System.out.println(sum);
		}

	}

}
