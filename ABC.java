import java.util.*;

class Xyz
{
	int a=10;
	Xyz()
	{
		method();
	}
	public void method()
	{
		System.out.println(a);
	}
}

class DEF extends Xyz
{
	int a=20;
	public void method()
	{
		System.out.println(a);
	}
}

public class ABC
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		DEF ob=new DEF();
	}
}