package module1;

public class Reverse {
public static void main(String args[])
{
	int i=4994,rem,rev=0;
	int j=i;
	while(i>0)
	{
		rem=i%10;
		i=i/10;
		rev=rev*10+rem;
	}
	if(j==rev) {
	System.out.println("palindrome no  "+rev);
}
	else
	{
		System.out.println("not a palindrome");
	}
}
}
