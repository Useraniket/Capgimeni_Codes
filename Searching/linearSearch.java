package Searching;

import java.util.Scanner;

public class linearSearch {
	public static int linearSearch(int []arr,int target)
	{
		int f=0;
		for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==target)
	    	{
	    		f=i;
	    		break;
	    	}
	    }
		return f;
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
	System.out.println("Enter the target element");
	int target=sc.nextInt();
	int f=linearSearch(arr,target);
    if(f==0)
    {
    	System.out.println("-1");
    }
    else
    {
    	System.out.println(f);
    }
}
}
