package array2D;

import java.util.Scanner;

public class new2D{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	int n=sc.nextInt();
	System.out.println("Enter the number of collumns:");
	int m=sc.nextInt();
	int arr[][]=new int[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			int maxrow=0;
			int maxcoll=0;
			int max=arr[0][0];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(arr[i][j]>max)
					{
						max=arr[i][j];
						maxcoll=j;
						maxrow=i;
					}
				}
			}
			System.out.println(maxrow+" "+maxcoll);
		}
}
