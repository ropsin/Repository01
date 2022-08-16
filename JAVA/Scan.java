class Scan
{
public static void main(String[] args)
{
	java.util.Scanner scn=new java.util.Scanner(System.in);
	
		System.out.println("Enter the name:");
		String name=scn.next(); //for String value

		System.out.println("Enter age:");
		int age=scn.nextInt(); // for integer value

		
		System.out.println("Enter salary:");
		double sal= scn.nextDouble(); // for double value

		
		System.out.println("Enter gender:");
		char g=scn.next().charAt(0); // index value in bracket

System.out.println("Name:" + name +  ",Age:" +age +",Salary;" + sal + ",Gender:" + g);
}
}