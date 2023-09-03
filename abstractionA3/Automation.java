package abstractionA3;

public class Automation extends MultipleLanguage implements Language, TestTool
{
	public void java()
	{
		System.out.println("Java method from Language Interface");
	}
	public void selenium()
	{
		System.out.println("Selenium method from TestTool Interface");
	}
	public void ruby()
	{
		System.out.println("Ruby method from Multiple Language Abstract Class");
	}
	public static void main(String[] args) {

		Automation A=new Automation();
		A.java();
		A.selenium();
		A.python();
		A.ruby();
	}


}





