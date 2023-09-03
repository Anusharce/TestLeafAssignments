package week3.day1;

public class Oneplus extends AndroidTV implements Android {

	@Override
	public void WatchVideo() {
		System.out.println("Watching the video");}
		public static void main(String[] args)
		{
			Oneplus bi=new Oneplus();
			bi.OpenApp();
			bi.WatchVideo();
		}
	}

	


