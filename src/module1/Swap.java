package module1;

public class Swap {
public static void main (String args[])
{
	int a=13,b=16,c;
	System.out.println(a);
	System.out.println(a+" before swap");
	System.out.println(b+" before swap");
	System.out.println(" ");
	c=a;
	a=b;
	b=c;
	System.out.println(a+" after swap");
	System.out.println(b+" after swap");
	System.out.println(c+" after swap");
	System.out.println("________________________");
	int x=22,y=33;
	System.out.println(x+" before swap");
	System.out.println(y+" before swap");
	System.out.println("  ");
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println(x+" after swap");
	System.out.println(y+" after swap");
}
}
