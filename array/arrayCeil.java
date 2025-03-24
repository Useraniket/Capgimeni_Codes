package array;

import java.util.*;
import java.util.Scanner;


public class arrayCeil {
	public static int CeilElement(int []arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		int ceilIndex=0;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target==arr[mid])
			{
				return mid;
			}
			else if(target<arr[mid])
			{
		
				end=mid-1;
			}
			else if(target>arr[mid])
			{
				ceilIndex=mid;
				start=mid+1;
			}
		}	
		return ceilIndex;
		
}
	
			
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]= {2,5,7,9,12,23,42};
	Arrays.sort(arr);
	int start=0;
	int end=arr.length-1;
	int target=24;
	while(start<=end)
	{
		int mid=start+(end-start)/2;
		if(target==arr[mid])
		{
			System.out.println(mid);
			return;
		}
		else if(target<arr[mid])
		{
			end=mid-1;
		}
		else if(target>arr[mid])
		{
			start=mid+1;
		}
	}	
	System.out.println(CeilElement(arr,target));
	}
}

