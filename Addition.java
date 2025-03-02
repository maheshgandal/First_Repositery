// Addition of Two Matrix

import java.util.*;

public class Addition
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int i,j;	

		System.out.println("Enter Matrix A");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("Enter Matrix B");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				b[i][j]=sc.nextInt();
		}
		System.out.println("Matrix A");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();

		}
		System.out.println("Matrix B");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();

		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j] + b[i][j];
			}
		}
		System.out.println("Addition Is");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();

		}
	}
}