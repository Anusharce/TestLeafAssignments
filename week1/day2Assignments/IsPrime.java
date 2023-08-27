package week1.day2Assignments;

public class IsPrime {

	public static void main(String[] args) {
		int n=24,temp=0;
		for(int i=2;i<n/2;i++)
		{
		if(n%i==0)
		{
			System.out.println("Given Number "+ n +" is not a Prime Number");
			temp=1;
			break;
		}
		}
		if(temp==0)
		{
			System.out.println("Given Number "+ n +" is a Prime Number");
		}
		

	}

}
