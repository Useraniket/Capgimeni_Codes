package array;

import java.util.Scanner;

public class arrar1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	int  arr[]=new int[10];
    int n=arr.length;
	
    for(int i=0;i<n;i++)
    {
    	arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
    	System.out.print(arr[i]);
    }
}
}
