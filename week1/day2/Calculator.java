package week1.day2;

public class Calculator {

private int addTwoNumbers(int num1, int num2) 
{
return num1+num2;
}
public float mulTwoNumbers(float num1, float num2)
{
return num1*num2;	
}
public void subTwoNumbers(int num2, int num1)
{
System.out.println(num2-num1);
}
public static class Mycalculator{
public static void main(String args[])
{
	Calculator ca=new Calculator();
	System.out.println(ca.addTwoNumbers(5,6));
	System.out.println(ca.mulTwoNumbers(5.7f,6.5f));
	ca.subTwoNumbers(5,6);
}}}

