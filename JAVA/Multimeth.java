class Multimeth // learn how to call stativ n non static method
{
 	public static void main(String[] args)
	{

	System.out.println("Roopam Sinha");
	
	Multimeth m1= new Multimeth(); //syntax to call non static method
	m1.meth1();
// new Multimeth().meth1(); (other syntax shortcut)

	meth2(); // calling static method directly

	new Multimeth().meth3();

	}

	 void meth1() //non static method
	{
	System.out.println("I love Roopam Sinha");

	}
	static void meth2() // static method
	{

	System.out.println("We love Roopam Sinha");

	}

void meth3() //non static method
	{
	System.out.println("Roopam Sinha is loved by one and all");

	}
}