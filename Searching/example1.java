package Searching;

import java.util.Scanner;

public class example1 {
	public static int linearSearch(int []arr)
	{
		int count=0;
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			while(arr[i]>0)
			{
				int rem=arr[i]%10;
				arr[i]/=10;
				count++;
			}
	    	if(count%2==0)
	    	{
	    		c++;
	    	}
	    }
		return c;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int f=linearSearch(arr);
    System.out.println(f);
}
}
