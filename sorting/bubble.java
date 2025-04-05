package sorting;

import java.util.*;
public class bubble {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	int n=sc.nextInt();
	boolean swapped;
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n-1;i++)
	{
		swapped=false;
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			swapped=true;
			}
		}
		if(!swapped)
		{
			break;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
