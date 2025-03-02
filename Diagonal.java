// Check Matrix is Diagonal or Not

// 1 0 0
// 0 2 0
// 0 0 3

import java.util.*;

public class Diagonal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a[][]=new int[3][3];
		int i,j;
		Boolean flag=true;	

		System.out.println("Enter Matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("Matrix A");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();

		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if((i==j && a[i][j] == 0) || (i!=j && a[i][j] !=0))
					flag=false;
			}
		}
		if(flag)
			System.out.println("Matrix is Diagonal");
		else
			System.out.println("Matrix is not Diagonal");
	}
}