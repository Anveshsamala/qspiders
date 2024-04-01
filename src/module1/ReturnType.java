package module1;

public class ReturnType {
public static int rect(int len,int br)
{
	int area=len*br;
	return area;
}
public static double Rcir(int radius)
{
	return 3.14*radius*radius;
}
public static double Aoftri(int h,int b)
{
	return 0.5*h*b;
}
public static int Aofsq(int square)
{
	return square*square;
}
public static void main(String args[])
{
	int A=rect(4,5);
	System.out.println(A);
	double B=Rcir(6);
	System.out.println(B);
	double C=Aoftri(2,3);
	System.out.println(C);
	int D=Aofsq(5);
	System.out.println(D);
}
}
