class Unaryopr
{
public static void main(String[] args)
	{

int x=1;
int y=1;
int z=1;

x= ++x + y++ + z++; //2 1 1      		2 2 2
System.out.println("x=" +x); //4

y= x++ + ++y + z++; // 4 3 2      		5 3 3     
System.out.println("y=" +y); //9

z= ++x + y++ + ++z; //6 9 4
System.out.println("z=" +z);// 19

System.out.println("x=" +x); //6
System.out.println("y=" +y); //10
System.out.println("z=" +z); //19



int l=1;
int m=1;
int n=1;

l= --l + m-- + --n; // 0 1 0		0 0 0
System.out.println("l=" +l);// 1

m= --l + --m + n--; //0 -1 0		0 -1 -1
System.out.println("m=" +m);//-1

n= --l + m-- + --n; //-1 -1 -2
System.out.println("n=" +n);//-4

System.out.println("l=" +l); // -1
System.out.println("m=" +m); //-2
System.out.println("n=" +n); //-4
	}
}