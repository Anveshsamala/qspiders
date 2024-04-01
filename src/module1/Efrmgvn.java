package module1;

public class Efrmgvn {
public static void main(String args[])
{
int num=234567,rem,sum=0;
while(num>0)
{
	rem=num%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			num=num/10;
}
System.out .println(sum);
}
}
