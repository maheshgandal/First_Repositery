// find frequency of anumber in array

import java.util.*;

public class Frequency
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a[]=new int[10];
		int i,j,temp,c=1;

		System.out.println("Enter 10 numbers");
		for(i=0;i<10;i++)
			a[i]=sc.nextInt();

		for(i=0;i<9;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(a[i] > a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting array is :");
		for(i=0;i<10;i++)
			System.out.print(a[i]+" ");

		for(i=0;i<10;i++)
		{
			if(i==a.length-1)
			{
				System.out.println(a[i]+" = "+c);
				break;
			}
			if(a[i]==a[i+1])
				c++;
			else
			{
				System.out.println(a[i]+" = "+c);
				c=1;	
			}
		}
	}
}