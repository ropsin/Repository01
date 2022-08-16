class Datatypes
{
public static void main(String[] args)
	{

//Primitive datatype

		byte b=123;
	     System.out.println(b);

		short s=24388;
	     System.out.println(s);

		int i=87865697;
	     System.out.println(i);

		long l=34567865697l;
	     System.out.println(l);

		char c='r';
	     System.out.println(c);

		char ch='0';
	     System.out.println(ch);

		boolean status=true;
	     System.out.println(status);

		float f=5768.43f;
	     System.out.println(f);

		double d=7763.42890;
	     System.out.println(d);

//Non-primitive datatypes

		String str="I am learning Java";
	     System.out.println(str);


//Narrowing casting

	double myDouble = 9.78;
      int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9



//additional practice

    	     System.out.println(3 + 3);
		
		System.out.print("Hello World! ");
    System.out.print("I will print on the same line.");

		System.out.println();
		System.out.println("Hello World! ");
    System.out.println("I will print on the next line.");

		
/*Note that if you assign a new value to an existing variable,
 it will overwrite the previous value*/
		int myNum = 15;
    		myNum = 20;  // myNum is now 20
    System.out.println(myNum);


		String name = "John";
    System.out.println("Hello " + name);


		String firstName = "Roopam ";
String lastName = "Sinha";
String fullName = firstName + lastName;
System.out.println(fullName);


		int x, y, z;
    x = y = z = 50;
    System.out.println(x + y + z);


	}
}



   
