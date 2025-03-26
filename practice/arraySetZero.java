package practice;

import java.util.Scanner;

public class arraySetZero {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	int n=sc.nextInt();
	System.out.println("Enter the number of collumns:");
	int m=sc.nextInt();
	int arr[][]=new int[n][m];
	int a[][]=new int[n][m];
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					arr[i][j]= sc.nextInt();
					a[i][j]=arr[i][j];
				}
			}
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
					if(arr[i][j]==0)
					{
						for(int k=0;k<a[0].length;k++)
						{
							a[i][k]=0;
						}
						for(int k=0;k<a.length;k++)
						{
							a[k][j]=0;
						}
					}
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					arr[i][j]=a[i][j];
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
}
}
