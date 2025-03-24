package array2D;

import java.util.Scanner;

public class summationOfEven {
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
				for(int j=0;j<m;j++)
				{
					if(arr[i][j]%2==0)
					{
						sum+=arr[i][j];
					}
			    }
			}
		System.out.println("Sum of:"+sum);		
    }
}

