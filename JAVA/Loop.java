import java.util.Scanner;

class Loop 


{
 static Scanner scn;

	public static void main(String [] args)
{
	 scn=new Scanner(System.in);

	System.out.println("Enter Age:");

	int a=scn.nextInt();

//while loop
//syntax

	while(a>=18) //true /false
	{
 	 System.out.println("Eligible to vote...");
	 a--;
	}

	loop1();
	
}

//do while loop

	static void loop1()
{
	System.out.println("Enter Age:");
	int x=scn.nextInt();

//syntax

	do
	{
	System.out.println("Executing....");
	x--;
	}
	while(x>=100);
}

}