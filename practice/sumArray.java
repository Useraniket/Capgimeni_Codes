package practice;

import java.util.Arrays;
import java.util.Scanner;

public class sumArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	int sum=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		sum+=arr[i];
		a[i]=sum;
	}
	System.out.println(Arrays.toString(a));
}
}
