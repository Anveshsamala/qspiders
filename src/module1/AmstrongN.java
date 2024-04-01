package module1;

public class AmstrongN {
public static void main(String args[])
{
	int num=153,rem,ams=0;
	int temp=num;
	while(num>0)
	{
		rem=num%10;
		num=num/10;
		ams=ams+(rem*rem*rem);
	}
	if(temp==ams)
	{
		System.out.println("amstrong  "+ams);
	}
	else
	{
		System.out.println("not a amstrong");
	}
}
}
