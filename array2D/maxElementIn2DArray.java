package array2D;

import java.util.Scanner;

public class maxElementIn2DArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	int n=sc.nextInt();
	System.out.println("Enter the number of collumns:");
	int m=sc.nextInt();
	Double max=0.0;
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
					if(max<arr[i][j])
					{
						max=arr[i][j];
					}
				}
				System.out.println();
			}
			System.out.println("Max:"+max);
		}
}
