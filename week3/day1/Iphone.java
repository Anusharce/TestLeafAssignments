package week3.day1;

public class Iphone extends IOS {

	public void makeCall()
	{
		System.out.println("Make Call from--->Iphone");
	}
	public void sendSMS()
	{
		System.out.println("Send SMS from--->Iphone");
	}
	public static void main(String[] args)
	{
		Iphone phn=new Iphone();
		phn.startApp();
		phn.increaseVolume();
		phn.shutDown();
		phn.makeCall();
		phn.sendSMS();
	}
}

