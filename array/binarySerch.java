package array;
import java.util.*;
public class binarySerch {
public static void main(String[] args) {
	int arr[]= {32,51,69,5,34};
	Arrays.sort(arr);
	int start=0;
	int end=arr.length-1;
	int target=69;
	while(start<=end)
	{
		int mid=start+(end-start)/2;
		if(target==arr[mid])
		{
			System.out.println(arr[mid]);
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
	System.out.println("invalid");
  }
}
