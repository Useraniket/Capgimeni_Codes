package array2D;

import java.util.Scanner;

public class summOfRowColl {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	int n=sc.nextInt();
	System.out.println("Enter the number of collumns:");
	int m=sc.nextInt();
	int arr[][]=new int[n][m];
	int sum=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<n;i++)
			{
				int rowSum=0;
				for(int j=0;j<m;j++)
				{
					rowSum+=arr[i][j];
			    }
				System.out.print(rowSum);
			}
			for(int j=0;j<m;j++)
			{
				int collSum=0;
				for(int i=0;i<n;i++)
				{
					collSum+=arr[i][j];
			    }
				System.out.print(collSum);
			}
			
			
    }
}

