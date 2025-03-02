// Find Floor of given number in array

import java.util.*;

public class Floor
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int a[]=new int[10];
        int i,j,temp,n;

        System.out.println("Enter 10 number ");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a number");
        n=sc.nextInt();
        
        for(i=0;i<10;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(a[j] > a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        if(a[0]>n)
        {
            System.out.println("Floor of "+n+" is "+(-1));
        }
        else
        {
            for(i=a.length-1;i>=0;i--)
            {
                if(a[i] <= n)
                {
                    System.out.println("Floor of "+n+" is "+a[i]);
                    break;
                }
            }
        }
    }
}