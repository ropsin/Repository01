

import java.util.Scanner;

class Condition2 // if else condition

{
 static Scanner scn;
	public static void main(String [] args)
	{
	 scn=new Scanner(System.in);
	System.out.println("Enter the number:");

	int a=scn.nextInt();

	if(a%2==0)
{
	if(a%5==0)
{

	System.out.println(a + " " + "is divisible by both 2 & 5");
}
	else
{
	System.out.println(a + " " + "is divisible by 2 but not by 5");
}
}
	else
{
	System.out.println(a + " " + "is not divisible by 2");
}
	daysoftheWeek();	
	monthsoftheYear();
}
	
	static void daysoftheWeek() // Switch case statement
{
	System.out.println("Enter the day\'s number:");
	int b=scn.nextInt();
	
//Syntax
	switch(b)
{
	case 1:
		System.out.println("Today is \"Sunday\" ");
	break;
	case 2:
		System.out.println("Today is \"Monday\" ");
	break;
	case 3:
		System.out.println("Today is \"Tuesday\" ");
	break;
	case 4:
		System.out.println("Today is \"Wednesday\" ");
	break;
	case 5:
		System.out.println("Today is \"Thursday\" ");
	break;
	case 6:
		System.out.println("Today is \"Friday\" ");
	break;
	case 7:
		System.out.println("Today is \"Saturday\" ");
	break;
	default:
		System.out.println("\"Invalid input\"");
}
}

static void monthsoftheYear() // Switch case statement
{
	System.out.println("Enter the month\'s  number:");
	int c=scn.nextInt();
	
//Syntax
	switch(c)
{
	case 11:
	case 12:
	case 1:
		System.out.println("It\'s \"Winter Season\" ");
	break;

	case 2:
	case 3:
		System.out.println("It\'s \"Spring Season\" ");
	break;

	case 4:
	case 5:
	case 6:
		System.out.println("It\'s \"Summer Season\" ");
	break;
		
	case 7:
	case 8:
		System.out.println("It\'s \"Monsoon Season\" ");
	break;
	
	case 9:
	case 10:
		System.out.println("It\'s \"Autumn Season\" ");
	break;
	default:
		System.out.println("\"Invalid input\"");
}

}
}