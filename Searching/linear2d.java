package Searching;

import java.util.Scanner;

public class linear2d {
	public static int linearSearch(int [][]arr,int target)
	{
		int f=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==target)
				{
					f=arr[i][j];
					break;
				}
			}
		
		}
		return f;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows in the array");
	int n=sc.nextInt();
	System.out.println("Enter the number of colls in the array");
	int m=sc.nextInt();
	int [][]arr=new int[n][m];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	
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
