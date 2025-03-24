package array2D;

import java.util.Scanner;

public class createUserNormal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	int n=sc.nextInt();
	System.out.println("Enter the number of collumns:");
	int m=sc.nextInt();
	Double arr[][]=new Double[n][m];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[0].length;j++)
		{
			arr[i][j]=sc.nextDouble();
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[0].length;j++)
		{
			System.out.print(arr[i][j]+"  ");
		}
		System.out.println();
	}
}
}
