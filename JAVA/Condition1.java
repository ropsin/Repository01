import java.util.Scanner;

class Condition1 // if else condition

{
 static Scanner scn;
	public static void main(String [] args)
	{
	 scn=new Scanner(System.in);
	System.out.println("Enter the number:");

	int a=scn.nextInt();
	//Syntax
		if(a%2==0)
	{
		System.out.println(a + " " + "is an Even number");
	}
		else
	{
		System.out.println(a + " " + "is an Odd number");
	}
		meth1();
	}

	static void meth1() //if else if condition
	{
		System.out.println("Enter the 1st number x:" );
		int x=scn.nextInt();
		System.out.println("Enter the 2nd number y:");
		int y=scn.nextInt();
//Syntax
		if(x>y)
		{
		System.out.println(" x is greater than y");
		}
		else if(y>x)
		{	
		System.out.println(" y is greater than x");
		}
		else
		{
		System.out.println(" x is equal to y");
		}
	}

}