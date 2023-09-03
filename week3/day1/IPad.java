package week3.day1;

public class IPad extends IOS{
	public void watchMovie() {
		System.out.println("Watch Movie-->From IPad");
	}
	public static void main(String[] args)
	{
		IPad pad=new IPad();
		pad.startApp();
		pad.increaseVolume();
		pad.shutDown();
		pad.watchMovie();
	}

}
