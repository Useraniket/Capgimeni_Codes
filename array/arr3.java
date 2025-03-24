package array;

import java.util.Scanner;

public class arr3 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	double  arr[]=new double[10];
    int n=arr.length;
	
    for(int i=0;i<n;i++)
    {
    	arr[i]=sc.nextDouble();
    }
    for(int i=n-1;i>=0;i--)
    {
    	
    	System.out.print(arr[i]);
    }
}
}